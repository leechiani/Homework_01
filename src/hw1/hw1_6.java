package hw1;

public class hw1_6 {
//	請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因	
	public static void main(String[] args) {
System.out.println(5 + 5 ); //10，整數型別與整數型別計算
System.out.println(5 + '5'); //58，'5'對應unicode u0035=十進位的53，整數型別與整數型別計算
System.out.println(5 + "5"); //55，+" "為串接相加，轉為字串
		
	}

}
