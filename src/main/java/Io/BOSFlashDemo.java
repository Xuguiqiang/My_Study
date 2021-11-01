package Io;

import sun.font.TrueTypeFont;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Xgq
 * @date 2021/11/117:23
 * @Title BOSFlashDemo
 * @Package API File
 * @Description
 */
public class BOSFlashDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./bos.txt",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "这年轻人，卧槽！\n";
        byte[] data = str.getBytes(StandardCharsets.UTF_8);
        bos.write(data);
        /**
         *   缓冲流的 flush方法可以强制将缓冲区中已经缓存的数据一次性写出
         * */
        bos.flush();
        System.out.println("文本写入完毕！");
        bos.close();
    }
}
