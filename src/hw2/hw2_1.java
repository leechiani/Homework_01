package hw2;

public class Hw2_1 {
//設計一隻Java程式，計算1～1000的偶數和	
	public static void main(String[] args) {
		int sum = 0;
		for (int cal = 0; cal <= 1000; cal += 2) {
			sum += cal;
		}
		System.out.println(sum);
	}
}
