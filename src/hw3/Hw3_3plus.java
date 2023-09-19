package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_3plus {
    public static void main(String[] args) {
        int hate;
        boolean[] lotteryPool = new boolean[50];
       
        System.out.println("阿文...請輸入你討厭哪個數字？");
        Scanner sc = new Scanner(System.in);
        hate = sc.nextInt();

        while (hate < 1 || hate > 9) {
            System.out.println("輸入錯誤，請輸入1~9");
            hate = sc.nextInt();
        }

        Arrays.fill(lotteryPool, true);
        for (int i = 1; i <= 49; i++) {
            int one = i % 10;
            int ten = i / 10;
            if (one == hate || ten == hate)
                lotteryPool[i] = false;
        }
        System.out.print("電腦選號為：");
        for (int j = 0; j < 6; j++) {
            int pick = (int) (Math.random() * 49 + 1);
            if (lotteryPool[pick] == false) {
                j--;
                continue;
            }
            System.out.print(pick + "   ");

        }

    }
}
