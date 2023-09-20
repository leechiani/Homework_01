package hw4;

//有個字串陣列如下(八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示：字元比對，String方法)
public class Hw4_1_3 {
    public static void main(String[] args) {
        int count = 0;
        String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

        for (int i = 0; i < planet.length; i++) {
            for (int j = 0; j < planet[i].length(); j++) {
                switch (planet[i].charAt(j)) {
                    case 'a', 'e', 'i', 'o', 'u':
                        count++;
                        break;
                }
            }
        }
        System.out.print(count);
    }
}
