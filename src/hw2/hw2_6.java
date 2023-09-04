package hw2;

public class Hw2_6 {
//雙層for回圈，for回圈的變數 可以給另一個for回圈當上下限
//設計一隻Java程式，輸出結果為以下：
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
	public static void main(String[] args) {
		
		int x = 0, y = 0;
		for (y = 10; y > 0; y--) {
			for (x = 1; x <= y; x++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}