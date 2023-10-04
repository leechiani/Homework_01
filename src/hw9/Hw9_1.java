package hw9;

public class Hw9_1 {
    public static void main(String[] args) {
        System.out.println("------大胃王比賽開始------");
        Runner r1 = new Runner("饅頭人");
        Runner r2 = new Runner("詹姆士");
        r1.start();
        r2.start();

        try {
            r1.join();
            r2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("------大胃王比賽結束------");
    }
}

class Runner extends Thread {
    private String name;
    private int sleepTime;

    public Runner() {
        
    }

    public Runner(String name) {
        this.name = name;
    }

    public int getSleepTime() {
        sleepTime = (int) (Math.random() * 26 + 5);
        return sleepTime;
    }

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(this.name + "吃第" + i + "碗飯");
            if (i != 10) {
                try {
                    Thread.sleep(getSleepTime() * 100);
                    Thread.yield();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            } else {
                System.out.println(this.name + "吃完了！");
            }
        }
    }
}
