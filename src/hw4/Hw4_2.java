package hw4;

import java.util.Scanner;

//員編：錢/25:2500/32:800/8:500/19:1000/27:1200
//輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的員工編號: 25 19 27 共3 人!」
//(提示：Scanner，二維陣列)

public class Hw4_2 {
  public static void main(String[] args) {
    int[][] friends = {
        { 25, 2500 },
        { 32, 800 },
        { 8, 500 },
        { 19, 1000 },
        { 27, 1200 }
    };

    int count = 0;

    int borrow = 0;
    System.out.println("借多少？");
    Scanner sc = new Scanner(System.in);
    borrow = sc.nextInt();
    System.out.println("有錢可借的員工編號：");

    for (int i = 0; i < 5; i++) {
      for (int j = 1; j <= 1; j++) {
        if (borrow <= friends[i][j]) {
          System.out.print(friends[i][0] + "  ");
          count++;
        }
      }
    }
    if (count == 0) {
      System.out.println("沒有人！");
    } else
      System.out.print("\n" + "共" + count + "人！");
  }

}
