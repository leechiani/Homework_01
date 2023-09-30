package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// 設計一個Train類別，並包含以下屬性：
// - 班次number，型別為int - 車種type，型別為String - 出發地start，型別為String
// - 目的地dest，型別為String - 票價price，型別為double
// 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
// • 請寫一隻程式，能印出不重複的Train物件
// • 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
// • 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
// • (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
public class Hw8_2 {

    static class Train implements Comparable<Train> {

        private int number;
        private String type, start, dest;
        private double price;

        public Train() {

        }

        public Train(int number, String type, String start, String dest, double price) {
            this.number = number;
            this.type = type;
            this.start = start;
            this.dest = dest;
            this.price = price;

        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void showInfo() {
            System.out.println(number + "車次" + type + start + "發車開往" + dest + ", 票價" + price);
        }
        
        public int compareTo(Train targetTrain) {
            System.out.println("11111");
            if (this.number == targetTrain.number) {
                return 0;
            } else if (this.number > targetTrain.number) {
                return -1;
            } else {
                return 1;
            }
    
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + number;
            result = prime * result + ((type == null) ? 0 : type.hashCode());
            result = prime * result + ((start == null) ? 0 : start.hashCode());
            result = prime * result + ((dest == null) ? 0 : dest.hashCode());
            long temp;
            temp = Double.doubleToLongBits(price);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Train other = (Train) obj;
            if (number != other.number)
                return false;
            if (type == null) {
                if (other.type != null)
                    return false;
            } else if (!type.equals(other.type))
                return false;
            if (start == null) {
                if (other.start != null)
                    return false;
            } else if (!start.equals(other.start))
                return false;
            if (dest == null) {
                if (other.dest != null)
                    return false;
            } else if (!dest.equals(other.dest))
                return false;
            if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
                return false;
            return true;
        }
    }

    public static void main(String[] args) {
        Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
        Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
        Train t3 = new Train(118, "自強", "高雄", "台北", 500);
        Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
        Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
        Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
        Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

        Set<Train> hs = new HashSet<Train>(); //不重複
        hs.add(t1);
        hs.add(t2);
        hs.add(t3);
        hs.add(t4);
        hs.add(t5);
        hs.add(t6);
        hs.add(t7);

        Iterator<Train> it = hs.iterator();
        while (it.hasNext())
        it.next().showInfo();

        List<Train> tl = new ArrayList<Train>(); // 由大到小
        tl.add(t1);
        tl.add(t2);
        tl.add(t3);
        tl.add(t4);
        tl.add(t5);
        tl.add(t6);
        tl.add(t7);
        Collections.sort(tl);

        for (int i = 0; i < tl.size(); i++) {
            tl.get(i).showInfo();
        }

        Set<Train> ts = new TreeSet<Train>(); //不重複+由大到小
        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);
        ts.add(t5);
        ts.add(t6);
        ts.add(t7);

        for(Train t : ts) {
        t.showInfo();
        }
        
    }
}
