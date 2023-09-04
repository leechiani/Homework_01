package hw2;

public class Hw2_2 {
//設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
	public static void main(String[] args) {
		int sum = 1;
		for (int cal = 2; cal <= 10; cal++ ) {
			 sum *= cal; //sum = 2, cal = 2
		} System.out.println(sum);
	} 
}
