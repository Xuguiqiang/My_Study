package Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Xgq
 * @date 2021/11/114:34
 * @Title WriteStringDemo
 * @Package API FileString
 * @Description 向文件写入文本数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream("./fos.txt",true);
        String str = "吃个桃桃~嗯~好凉凉~！这年轻人，我艹！你瞅啥呢？\n";
        byte[] data = str.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        str = "你真的是，我不想说！\n";
        data = str.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        long end = System.currentTimeMillis();
        str = "此次共计耗时："+(end-start)+"毫秒。\n";
        data = str.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        fos.close();
    }
}
