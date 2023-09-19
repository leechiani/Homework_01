package hw3;

import java.util.Scanner;

public class Hw3_2plus {
	public static void main(String[] args) {

		int target = (int) (Math.random() * 101);
//		System.out.println(target);

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入0~100任一數：");
		int answer = sc.nextInt();
		
		

		while (answer != target) {
			if (answer < 0 || answer > 100) {
				System.out.println("錯誤！請輸入0~100任一數：");
				answer = sc.nextInt();
			}else {
				if(answer > target) {
				System.out.println("太大了！請輸入0~100任一數：");
				answer = sc.nextInt();
			}else {
				System.out.println("太小了！請輸入0~100任一數：");
				answer = sc.nextInt();}
			}
		}
		System.out.println("猜對了，答案是" + target);
	}
}
