package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
public class Hw7_1 {
    public static void main(String[] args) {
        
        int countChar = 0, countLine = 0;
        File file = new File("c:/THA104_Workspace/Sample.txt");
        // File file = new File("Sample.txt"); //vs code
        // File file = new File("../Sample.txt"); // eclipse

         try {
            FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "Big5"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line);
                countLine++;
                countChar += line.length();
            }
        
            br.close();
            fis.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
        System.out.print("\n" + file.getName() + "檔案共有" + file.length() + "個位元組, " + countChar + "個字元, " + (countLine + 1) + "列資料");
    }
}