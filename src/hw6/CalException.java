package hw6;
// 1. x與y同時為0，(產生自訂的CalException例外物件)
// 2. y為負值，而導致x的y次方結果不為整數
// 3. x與y皆正確情況下，會顯示運算後結果
public class CalException extends Exception{

    public CalException(){

    }
    public CalException(String message) {
        super(message);
    }
    
}
