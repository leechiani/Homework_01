package hw5;

public class Pencil extends Pen {

    public int getPrice() {
        double price = super.getPrice();
        return (int) (price * 0.8);
    }
    
    public void write() {
        System.out.println("削鉛筆再寫");
    }

}
