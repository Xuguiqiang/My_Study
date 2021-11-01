package Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Xgq
 * @date 2021/11/110:48
 * @Title CopyDemo
 * @Package API File Stream
 * @Description
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./git.exe");
        FileOutputStream fos = new FileOutputStream("./git1.exe");
        int b;
        long start = System.currentTimeMillis();
        while ((b=fis.read()) != -1){
            fos.write(b);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完成,共耗时："+(end-start)+"毫秒！");
        fis.close();
        fos.close();
    }
}
