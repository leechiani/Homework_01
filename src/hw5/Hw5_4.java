package hw5;

//設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
// 此驗證碼內容包含了英文大小寫與數字的亂數組合
public class Hw5_4 {

    private String pool = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private String codeCharArray = "";

    public String genAuthCode() {
        for (int i = 0; i < 8; i++) {
            int getIndex = (int) (Math.random() * pool.length());
            codeCharArray += Character.toString(pool.charAt(getIndex));
        }
        return codeCharArray;
    }

    public static void main(String[] args) {
        Hw5_4 authCode = new Hw5_4();
        String code;

        code = authCode.genAuthCode();
        System.out.println("本次隨機產生驗證碼為：" + code);
    }
}