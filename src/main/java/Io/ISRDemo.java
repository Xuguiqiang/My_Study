package Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Xgq
 * @date 2021/11/211:40
 * @Title ISRDemo
 * @Package API File
 * @Description 使用字符流从文件读取字条
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        int d;
        while ((d = isr.read()) != -1){
            System.out.print((char) d);
        }
        /**
         *
         *         byte[] b = new byte[fis.available()];
         *         fis.read(b);
         *         String str = new String(b,"UTF-8");
         *         System.out.println(str);
         *
         * */
        isr.close();
    }
}
