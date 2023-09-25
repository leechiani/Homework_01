package hw6;

import java.util.Scanner;

// Calculator.java裡有個自訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果
public class Calculator {
    Scanner sc = new Scanner(System.in);
    private int x, y;

    public int getX() {

        System.out.println("請輸入x的值：");
        while (!sc.hasNextInt()) { // 輸入非int
            System.out.println("格式錯誤，請輸入正整數：");
            sc.next();
        }
        x = sc.nextInt();
        return x;
    }

    public int getY() {
        System.out.println("請輸入y的值：");
        while (!sc.hasNextInt()) {
            System.out.println("格式錯誤，請輸入正整數：");
            sc.next();
        }
        y = sc.nextInt();
        return y;
    }

    public int powerXY(int x, int y) throws CalException {

        if (x == 0 && y == 0) {
            throw new CalException("0的0次方沒有意義！");
        } else if (y < 0) {
            throw new CalException("次方為負值，結果回傳不為整數！");
        } else
            return (int) Math.pow(x, y);

    }
}
