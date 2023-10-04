package hw9;

//無法在額度用完當下跳回main
//一旦修改金額就會有bug
public class Hw9_2 {
    public static void main(String[] args) {
        UseATM a = new UseATM();

        Mom mom = new Mom(a);
        Son son = new Son(a);
        mom.start();
        son.start();
        try {
            mom.join();
            son.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        // System.out.println("十次額度用完了！");
        // System.out.println("存錢十次額度用完了！");
        System.out.println("------程式結束------");
    }
}

class UseATM {
    private static int balance = 0;
    private int countW = 0; // 領了幾次錢
    private int countD = 0; // 存了幾次錢

    synchronized void deposit(int amount) {
        if (countW != 10) { // 熊大的提款次數用完就不做存款動作
        while (balance > 3000) {

            System.out.println("老媽看到餘額，停止匯款");

            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        balance += amount;
        countD++;
        System.out.println("老媽存了" + amount + "，帳戶共有$" + balance + "元，\n" + "老媽告知熊大帳戶有錢");
        notify();

        if (countD == 10) { // 存到十次一定要喚醒熊大
            notify();
            System.out.println("十次存款額度用完了！");
        }
        }
    }

    synchronized void withdraw(int amount) {
        if (countD != 10) { // 老媽的存款次數用完就不做提款動作
            while (balance < amount) {
                System.out.println("帳戶沒錢，熊大不提款");
                try {
                    wait();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

            balance -= amount;
            countW++;
            System.out.println("熊大領了" + amount + "，帳戶共有$" + balance + "元");
            if (balance < 2000) {
                System.out.println("熊大看到餘額，通知老媽匯款");
                System.out.println("老媽被熊大通知匯款");
                notify();
            }
            if (countW == 10) { // 領到十次一定要喚醒老媽
                notify();
                System.out.println("十次提款額度用完了！");
            }
        }
    }
}

class Mom extends Thread {
    UseATM useATM;

    public Mom(UseATM useATM) {
        this.useATM = useATM;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++)
            useATM.deposit(2000);
    }
}

class Son extends Thread {
    UseATM useATM;

    public Son(UseATM useATM) {
        this.useATM = useATM;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++)
            useATM.withdraw(1000); // 提款額度會先用完
    }
}
