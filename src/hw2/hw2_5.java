package hw2;

public class hw2_5 {
//設計一隻程式，1~49個位數或十位數不含4，輸出:阿文可以選擇的數字有哪些？共幾個？
	public static void main(String[] args) {
		System.out.print("阿文可以選擇的數字有");
		int count = 0, number = 1;
		for (number = 1; number <= 39; number++) {
			if (number % 10 != 4) {
				System.out.print(number + "\t");
				count++;
//			} else {
//				continue;
//			}
			}
		}
		System.out.println("\n" + "共" + count + "個");
	}
}