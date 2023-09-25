package hw5;

import java.util.Scanner;
//設計一個方法為starSquare(int width, int height)，
//當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
public class Hw5_1_1 {

    public void starSquare(int width, int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int width = 0;
        int height = 0;

        Hw5_1_1 squarePrinter = new Hw5_1_1();

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入寬與高：");
        width = sc.nextInt();
        height = sc.nextInt();

        while (width <= 0 || height <= 0) {
            System.out.print("錯誤，請輸入正整數！");
            System.out.print("請輸入寬與高：");
            width = sc.nextInt();
            height = sc.nextInt();
        }
        squarePrinter.starSquare(width, height);
        sc.close();
    }
}
