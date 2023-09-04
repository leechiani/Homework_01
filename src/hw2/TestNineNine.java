package hw2;

public class TestNineNine {
	// 輸出九九乘法表
	public static void main(String[] args) {
//	 for
//		int i, j;
//	for (i = 1; i <= 9; i++) {
//		for(j = 1; j <= 9; j++) {
//			System.out.print(i + "*" + j +"=" + i * j + "\t");
//			
//			} System.out.println();
//	}
//	
		// for + while
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println();

		// for + do while
		int k, l;
		for (k = 1; k <= 9; k++) {
			l = 1;
			do {
				System.out.print(k + "*" + l + "=" + k * l + "\t");
				l++;
			} while (l <= 9);
			System.out.println();
		}
		System.out.println();

		// while + do while
		int m = 0, n = 1;
		while (m < 9) {
			++m;
			n = 1;
			do {
				System.out.print(m + "*" + n + "=" + m * n + "\t");
				n++;
			} while (n <= 9);
			System.out.println();

		}
	}
}
