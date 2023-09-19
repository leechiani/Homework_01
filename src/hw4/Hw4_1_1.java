package hw4;

import java.util.Arrays;

//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)

public class Hw4_1_1 {
	
	public static void main(String[] args) {
	int[]iArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
	int sum = 0;
	int avg = 0;
	for (int i = 0; i < 10; i++) {
		sum += iArray[i];
	}
	avg = sum /(iArray.length);
	System.out.println("平均值：" + avg);
	
	Arrays.sort(iArray);
	
	System.out.print("大於平均值的元素：");
	for (int j = 0; j < 10; j++) {
		if(iArray[j] > avg) {
			System.out.print( iArray[j] + "   ");
		}
	}
	
	
	
	}
	
}