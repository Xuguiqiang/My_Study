package Io;

import java.io.*;

/**
 * @author Xgq
 * @date 2021/11/116:15
 * @Title BOSDemo
 * @Package API FileStream
 * @Description
 *
 * Java将流分为两类
 * 节点流和处理流
 * 节点流也称为低级流，是真实程序连接另一端的管道，读写一定是建立在节点流的基础上进行的，比如文件流就是节点流
 *
 * 处理流也称为高级流，是不能独立存在的，必须连接在其它流上，目的是当数据流经它时对数据进行某些加工处理，简化我们的同等操作
 *
 * 实际开发中我们经常会串联一组高级流并最终连接到低级流上，是读写数据以流水线式的加工处理来完成，这个操作称为 ”流的连接“。
 *
 * 缓冲流
 * java.io.BufferedInputStream 和 BufferedOutputStream
 * 缓冲流是一对高级流，作用是加快读写效率
 *
 */
public class BOSDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./git.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("./git_cp.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        long start = System.currentTimeMillis();
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件复制完成，用时："+(end-start)+"毫秒！");
        bis.close();
        bos.close();
    }
}
