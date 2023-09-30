package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// 寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
public class Hw7_1 {
    public static void main(String[] args) {
        int i;
        int countChar = 0, countLine = 0;
        File file = new File("c:/THA104_Workspace/Sample.txt");
        // File file = new File("Sample.txt"); //vs code
        // File file = new File("../Sample.txt"); // eclipse

        try {
            FileReader fr = new FileReader(file);
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
                if ((char) i == '\n') {
                    countLine++;
                } else
                    countChar++;
            }
            fr.close();
        } catch (IOException io) {
        }

        System.out.print(
                file.getName() + "檔案共有" + file.length() + "個位元組, " + countChar + "個字元, " + (countLine + 1) + "列資料");
    }
}