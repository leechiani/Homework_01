package hw8;

// • 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
// • 移除不是java.lang.Number相關的物件
// • 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Hw8_1 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(Integer.valueOf(100));
        list.add(Double.valueOf(3.14));
        list.add(Long.valueOf(21L));
        list.add(Short.valueOf("100"));
        list.add(Double.valueOf(5.1));
        list.add("Kitty");
        list.add(Integer.valueOf(100));
        list.add(new Object());
        list.add("Snoopy");
        list.add(new BigInteger("1000"));

        Iterator<Object> it = list.iterator();
        while(it.hasNext())
        System.out.print(it.next() + " ");

        // System.out.println();
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }

        // System.out.println();
        // for (Object obj : list)
        // System.out.print(obj + " ");

        for (int j = 0; j < list.size(); j++) {
            Object obj = list.get(j);
            if (!(obj instanceof Number)) {
                list.remove(j);
                j--;
            }
        }
        // System.out.println();
        // for (int k = 0; k < list.size(); k++) {
        // System.out.print(list.get(k) + " ");
        // }

        // System.out.println();
        // Iterator<Object> it2 = list.iterator();
        // while (it2.hasNext()) {
        // System.out.print(it2.next() + " ");
        // }

        System.out.println();
        for (Object obj2: list) {
            System.out.print(obj2 + " ");
        }
    }
}
