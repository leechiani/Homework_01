package hw3;
//使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
//(提示：Scanner，三角形成立條件，判斷式if else)
//(進階功能：加入直角三角形的判斷)

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1 {
	Scanner sc = new Scanner(System.in);

	private String tType;

	public int[] getSide() {
		
		int[] getSide = new int[3];
		for (int i = 0; i < 3; i++) {
			getSide[i] = sc.nextInt();
		}
		return getSide;
	}

	public void setSide(int[] side) {

		Arrays.sort(side);

		if (side[0] + side[1] <= side[2])
			tType = "不是三角形";
		else if (side[0] == side[2])
			tType = "正三角形";
		else if (side[0] == side[1] || side[1] == side[2])
			tType = "等腰三角形";
		else if (Math.pow(side[0], 2) + Math.pow(side[1], 2) == Math.pow(side[2], 2))
			tType = "直角三角形";
		else
			tType = "其他三角形";
		System.out.println(tType);
	}

	public static void main(String[] args) {
		Hw3_1 triangle = new Hw3_1();
		
		System.out.println("請輸入三個整數：");
		int[] tSide = triangle.getSide();

		while (tSide[0] <= 0 || tSide[1] <= 0 || tSide[2] <= 0) {
			System.out.println("不可輸入正整數以外的內容：");
			tSide = triangle.getSide();
		}
		triangle.setSide(tSide);
	}
}
