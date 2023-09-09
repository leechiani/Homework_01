package hw3;

//	• 請分別建立x, y, z三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡，
//	再將結果顯示於螢幕上
//	• x和y陣列中的數字：
//	• 請用亂數產生介於0～30之間的整數
//  	取0~30的整數
//		int r = (int) (Math.random() * 31) ;
public class Hw3_1 {
	public static void main(String[] args) {
		int[][] arrayX = new int[3][3];
		int[][] arrayY = new int[3][3];
		int[][] arrayZ = new int[3][3];
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				arrayX[a][b] = (int) (Math.random() * 31);
				arrayY[a][b] = (int) (Math.random() * 31);
				arrayZ[a][b] = arrayX[a][b] + arrayY[a][b];
//				System.out.print(arrayX[a][b] + "\t");
//				System.out.print(arrayY[a][b] + "\t");
				System.out.print(arrayZ[a][b] + "\t");
			}
			System.out.println();
		}
		
	}
}