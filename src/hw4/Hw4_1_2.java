package hw4;

//請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH
//(提示：String方法，陣列)

public class Hw4_1_2 {
	public static void main(String[] args) {
		String target = "I love Java :(";
		int length = target.length();
		String[] reverse = new String[length];

		for (int i = length - 1; i >= 0; i--) {
			reverse[i] = target.substring(i, i + 1);
			System.out.print(reverse[i]);
		}
	}
}
