package hw5;

// 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
// 可以找出二維陣列的最大值並回傳
public class Hw5_2 {

    private int intMax = 0;
    private double doubleMax = 0;

    public int maxElement(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (intMax < intArray[i][j])
                    intMax = intArray[i][j];
            }
        }
        return intMax;
    }

    public double maxElement(double[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                if (doubleMax < doubleArray[i][j])
                    doubleMax = doubleArray[i][j];
            }
        }
        return doubleMax;
    }

    public static void main(String[] args) {
        int[][] intArray = {
                { 2, 77, 24, 33 },
                { 39, 45, 9, 13 }
        };
        double[][] doubleArray = {
                { 1.8, 33.4, 45.0, 12.7 },
                { 9.2, 80.1, 63.9, 13.2 }
        };
        Hw5_2 getMax = new Hw5_2();
        System.out.println(getMax.maxElement(intArray));
        System.out.println(getMax.maxElement(doubleArray));
    }
}
