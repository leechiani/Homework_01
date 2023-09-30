package hw7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// 亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
// (使用append功能讓每次執行結果都能被保存起來)
public class Hw7_2 {

    public static void main(String[] args) {

        // File file = new File("Data.txt");
        // file.delete();

        try {

            FileOutputStream fos = new FileOutputStream("Data.txt", true);
            PrintStream ps = new PrintStream(fos);

            for (int i = 0; i <= 10; i++) {
                int j = (int) (Math.random() * 1000 + 1);
                ps.print(j + "   ");
            }
            ps.println();
            ps.close();
            fos.close();

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
