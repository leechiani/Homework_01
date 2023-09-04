package hw1;

public class hw1_3 {
//	請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void main(String[] args) {
		
		int total = 256559;
		int s = 0, m = 0, h = 0, d = 0;
		s = total % 60;
		total /= 60;
		m = total % 60;
		total /= 60;
		h = total % 24;
		d = total /= 24;
		System.out.print(d + "d " + h + "h " + m  + "m " + s + "s ");		
	}
}


		
