package hw1;

public class Hw1_5 {
//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
//	請用程式計算10年後，本金加利息共有多少錢(用複利計算)	
//本利和=本金*(1+年利率)^年數
	public static void main(String[] args) {
		
		double base = 150, rate = 0.02, period = 10;
		double totalIncome = base * Math.pow( (1 + rate), period) ; 
		System.out.println(totalIncome + "萬");
	}

}
