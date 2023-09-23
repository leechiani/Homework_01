package hw3;

import java.util.Scanner;

//如何換行
public class Hw3_3 {

	public static void main(String[] args) {
		int hate;
		int count = 0;

		System.out.println("阿文...請輸入你討厭哪個數字？");
		Scanner sc = new Scanner(System.in);
		hate = sc.nextInt();

		while (hate < 1 || hate > 9) {
			System.out.println("輸入錯誤，請輸入1~9");
			hate = sc.nextInt();
		}
		sc.close();
		
		for (int i = 1; i <= 49; i++) {

			if (i % 10 != hate && i / 10 != hate) {
				count++;
				System.out.print(i + "\t");
				
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n" + "總共有" + count + "個數字可選");
	}

}