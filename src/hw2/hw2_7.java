package hw2;

public class hw2_7 {
//	設計一隻Java程式，輸出結果為以下：
//	A		=65
//	BB
//	CCC
//	DDDD
//	EEEEE
//	FFFFFF		=70
	public static void main(String[] args) {
		char alphabet = 'A';
		int layer = 0;
		int count = 0;
		for (layer = 1; layer <= 6; layer++) {
			for (count = 1; count <= layer; count++) {
				System.out.print(alphabet);
			}
			System.out.println();
			alphabet++;

		}
	}
}
