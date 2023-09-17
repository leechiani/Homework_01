package hw3;
//使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
//(提示：Scanner，三角形成立條件，判斷式if else)
//(進階功能：加入直角三角形的判斷)

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1 {

	private int side1, side2, side3;
	private String triangleType;

	public void setSide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數：");
		if (sc.hasNextInt()) {
			side1 = sc.nextInt();
			side2 = sc.nextInt();
			side3 = sc.nextInt();
			sc.close();

			int side[] = { side1, side2, side3 };
			Arrays.sort(side);

//			if (side[0] * side[1] * side[2] <= 0 ) {
//				triangleType = "不可輸入正整數以外的內容";				
//			}
//			else 
				if (side[0] + side[1] <= side[2])
				triangleType = "不是三角形";
			else if (side[0] == side[1] && side[0] == side[2])
				triangleType = "正三角形";
			else if (side[1] == side[2])
				triangleType = "等腰三角形";
			else if (Math.pow(side[0], 2) + Math.pow(side[1], 2) == Math.pow(side[2], 2))
				triangleType = "直角三角形";
			else
				triangleType = "其他三角形";
			System.out.println(triangleType);	
		}

		else {
			System.out.println("不可輸入正整數以外的內容");
		}
	}

	public static void main(String[] args) {
		Hw3_1 t = new Hw3_1();
		t.setSide();

	}
}
