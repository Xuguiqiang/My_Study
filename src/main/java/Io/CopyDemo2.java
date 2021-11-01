package Io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Xgq
 * @date 2021/11/111:46
 * @Title CopyDemo2
 * @Package API File Stream
 * @Description 复制案例2
 *
 * 提高每次读写的数据量，减少读写的次数，可以提高读写效率
 *
 * 单字节读写是一种随机读写形式
 * 一组字节读写是块读写形式
 * 对于机械硬盘和很多其它硬件而言，块读写的效率很好，但是随机读写性能差
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./git.exe");
        FileOutputStream fos = new FileOutputStream("./git_cp.exe");
        byte[] b = new byte[1024*10];
        int len;
        long start = System.currentTimeMillis();
        while ((len = fis.read(b)) != -1){
            fos.write(b,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完成，共耗时："+(end-start)+"毫秒！");
        fis.close();
        fos.close();
    }
}
