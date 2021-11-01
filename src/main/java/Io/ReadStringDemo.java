package Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Xgq
 * @date 2021/11/115:59
 * @Title ReadStringDemo
 * @Package API FileStream
 * @Description 读取文件字符串
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        /**
         *
         *         File file = new File("./fos.txt");
         *         FileInputStream fis = new FileInputStream(file);
         *         byte[] data = new byte[fis.available()];
         *         fis.read(data);
         *         String str = new String(data,"UTF-8");
         *         System.out.println(str);
         *
         * */

        FileInputStream fis = new FileInputStream("./fos.txt");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        String str = new String(data,"UTF-8");
        System.out.println(str);

    }
}
