package hw1;

public class Hw1_2 {
//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？
	public static void main(String[] args) {
		int eggs = 200;
		System.out.print("200顆蛋是" + eggs / 12 + "打");
		System.out.println(eggs % 12 + "顆");
	}
}
