package hw10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

// 輸入一個任意數後，可以選擇要以下列何種表示方法顯示
// (1)千分位(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖
// (提示： TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
public class Hw10_1_2 {
    Scanner sc = new Scanner(System.in);
    private String targetS;
    private double targetNum;
    private int targetForm;
    private boolean ifContinue = true;
    
    public double getTarget(String ifRegex) {
         do {
            targetS = sc.next();
            if (!targetS.matches(ifRegex)) {
                System.out.printf("數字格式不正確，請再輸入一次：");
            } else {
                targetNum = Double.parseDouble(targetS);
                ifContinue = false;
            }
        } while (ifContinue);
        return targetNum;
    }

    public int getForm(String ifRegex) {
        ifContinue = true;
        do {
            targetS = sc.next();
            if (!targetS.matches(ifRegex)) {
                System.out.printf("錯誤，請輸入1~3：");
            } else {
                targetForm = Integer.parseInt(targetS);
                ifContinue = false;
            }
        } while (ifContinue);
        return targetForm;
    }
    public static void main(String[] args) {

        String ifRegex1 = "^[0-9]*\\.*[0-9]*$";
        String ifRegex2 = "^[1-3]$";
        double targetNum;
        int targetFormat;
       
        Hw10_1_2 formatter= new Hw10_1_2();
        Format f1 = new DecimalFormat(",###.##");
        Format f2 = new DecimalFormat(",###.####%");
        Format f3 = new DecimalFormat("#.###E0");

        
        System.out.print("請輸入數字：");
        targetNum = formatter.getTarget(ifRegex1); 
        System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號：");
        targetFormat = formatter.getForm(ifRegex2);

        if (targetFormat == 1) {
            System.out.println(f1.format(targetNum));
        } else if (targetFormat == 2) {
            System.out.println(f2.format(targetNum));
        } else {
            System.out.println(f3.format(targetNum));
        }
    }
}