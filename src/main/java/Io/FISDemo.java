package Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Xgq
 * @date 2021/11/110:17
 * @Title FISDemo
 * @Package API File Stream
 * @Description 输入流
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fos.dat");
        int read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);
        System.out.println("文件读取完毕！");
        fis.close();
    }
}
