package hw5;

public class InkBrush extends Pen {

    public int getPrice() {
        double price = super.getPrice();
        return (int) (price * 0.9);
    }

    public void write() {
        System.out.println("沾墨汁再寫");
    }

}
