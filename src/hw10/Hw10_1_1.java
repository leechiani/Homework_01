package hw10;

public class Hw10_1_1 {
    // 亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否為質數

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        
        for (int i = 5; i * i <= num; i +=6) {
            if (num % i == 0 || num % (i + 2) == 0)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 0;
        boolean isPrime;

        for (int i = 1; i <= 5; i++) {
            num = (int) (Math.random() * 100 + 1);
            isPrime = isPrime(num);
            if (isPrime)
                System.out.println(num + "是質數");
            else
                System.out.println(num + "不是質數");
        }
    }
}
