package hw6;

import java.util.Scanner;

// Calculator.java裡有個自訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果
// 執行後，使用者可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
// 1. x與y同時為0，(產生自訂的CalException例外物件)
// 2. y為負值，而導致x的y次方結果不為整數
// 3. x與y皆正確情況下，會顯示運算後結果
public class CalTest {

    public static void main(String[] args) {
        int x, y;
        boolean hasException = true; //是否還要進行
        Calculator c = new Calculator();
        do {
            x = c.getX();
            y = c.getY();

            try {
                System.out.println(x + "的" + y + "次方等於" + c.powerXY(x, y));
                hasException = false; //沒有例外，程式結束
            } catch (CalException e) {
                e.printStackTrace();
            }
        } while (hasException); //有例外所以從頭開始
    }
}