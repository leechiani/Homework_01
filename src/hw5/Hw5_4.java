package hw5;
// 待處理：不暴力的解法
//設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
// 此驗證碼內容包含了英文大小寫與數字的亂數組合
public class Hw5_4 {

    private String pool = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private String[] getCode = new String[8];
    
    // public void getLength() {
    //     System.out.println(pool.length());
    // }
    
    public void genAuthCode() {
        for (int i = 0; i < 8; i++) {
            int getIndex = (int) (Math.random() * pool.length());
            getCode[i] = pool.substring(getIndex, getIndex + 1);
            System.out.print(getCode[i]);
        }
    }

    public static void main(String[] args) {
        Hw5_4 authCode = new Hw5_4();
        System.out.println("本次隨機產生驗證碼為：");
        authCode.genAuthCode();
        // authCode.getLength();
    }
}
