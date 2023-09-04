package hw2;

public class hw2_4 {
//設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
	public static void main(String[] args) {
		int sum;
		for (int cal = 1; cal <= 10 ; cal++) {
			sum = cal * cal;
			System.out.print(sum + " ");
		}
	}
}
