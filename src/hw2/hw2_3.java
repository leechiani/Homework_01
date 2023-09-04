package hw2;

public class hw2_3 {
//設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
	public static void main(String[] args) {
		int sum = 1, cal = 2;
		while (cal <= 10) {
			sum *= cal;
			cal++;
		} System.out.println(sum);
	}
}
