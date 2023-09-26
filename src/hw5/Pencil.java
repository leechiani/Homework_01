package hw5;

public class Pencil extends Pen {

    private int actualPrice;

    public int getPrice() {
        return actualPrice;
    }

    public void setPrice(int price) {
        actualPrice = (int) (price * 0.8);
    }

    public void write() {
        System.out.println("削鉛筆再寫");
    }

}
