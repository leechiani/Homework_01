package hw5;

class Hw5_3_myRectangleMain {

    public static void main(String[] args) {
        Hw5_3_myRectangle rectangle1 = new Hw5_3_myRectangle();
        rectangle1.setWidth(10);
        rectangle1.setDepth(20);
        System.out.println(rectangle1.getArea());

        Hw5_3_myRectangle rectangle2 = new Hw5_3_myRectangle(10, 20);
        System.out.println(rectangle2.getArea());
    }
}