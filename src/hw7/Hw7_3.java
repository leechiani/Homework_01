package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

// 完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
// 代表的檔案會複製到第二個參數代表的檔案
public class Hw7_3 {

    static void copyFile(File x, File y) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(x));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(y));
        PrintStream ps = new PrintStream(bos);
        int i;
        while ((i = bis.read()) != -1) {
            ps.print((char) i);
            ps.flush();
            System.out.print((char) i);
        }
        ps.println();
        ps.close();
        bos.close();
        bis.close();
    }

    public static void main(String[] args) {
        File x = new File("x.txt");
        File y = new File("y.txt");
        try {
        copyFile(x, y);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
