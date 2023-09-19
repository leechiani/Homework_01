package hw3;

import java.util.Scanner;

public class Hw3_2 {

	public static void main(String[] args) {

		int target = (int) (Math.random() * 10);
		// System.out.println(target);

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！");
		int answer = sc.nextInt();


		while (answer != target) {
			if (answer < 0 || answer > 9) {
				System.out.println("輸入錯誤！請輸入0~9任一數：");
				answer = sc.nextInt();
			} else {

				System.out.println("猜錯囉");
				answer = sc.nextInt();
			}

		}
		System.out.println("答對了！答案就是" + target);
	}

}