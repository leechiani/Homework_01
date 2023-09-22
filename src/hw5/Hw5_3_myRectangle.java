package hw5;

public class Hw5_3_myRectangle {

    private double width;
    private double depth;

    public Hw5_3_myRectangle() {
    }

    public Hw5_3_myRectangle(double width, double depth) {
        setWidth(width);
        setDepth(depth);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getArea() {
        return width * depth;
    }
}
