package hw5;

public class InkBrush extends Pen {

    private int actualPrice;

    public int getPrice() {
        return actualPrice;
    }

    public void setPrice(int price) {
        actualPrice = (int) (price * 0.9);
    }

    public void write() {
        System.out.println("沾墨汁再寫");
    }

}
