package hw5;

//設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
public class Hw5_1_2 {

    private double sum;
    // private double avg;
    private int rand;

    public void randAvg() {
        System.out.println("本次亂數結果：");
        for (int i = 0; i <= 10; i++) {
            rand = (int) (Math.random() * 101);
            System.out.print(rand + "   ");
            sum += rand;
        }
        // avg = sum / 10;
        System.out.print("\n" + "平均值為" + sum / 10);
    }

    public static void main(String[] args) {
        Hw5_1_2 getRandAvg = new Hw5_1_2();
        getRandAvg.randAvg();
    }
}
