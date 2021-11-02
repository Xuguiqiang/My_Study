package Io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Xgq
 * @date 2021/11/210:55
 * @Title OSWDemo
 * @Package API FileStream
 * @Description 字符流
 *
 *   java将流按照读写单位划分为：字节流和字符流
 *   InputStream 和 OutputStream 是字节流的超类
 *   Reader 和 Writer是字符流的超类
 *   这此超类之间没有继承关系，是平级的
 *
 *   字符流中定义了读写字符的相关read 和 write方法，使得我们读写的最小单位为字符(char)
 *   注意：字符流仅适合读写文本数据
 *   字符流底层本质还是读写字节，只是字节与字符的转换字符流会完成
 *
 *   转换流：
 *   InputStreamReader 和 OutputStreaWriter
 *   常用的一对字符流实现类，它们是一对高级流，实际开发中我们几乎不会直接操作他们，但是它们在流连接中是非常重要的一环
 *
 *   功能：
 *   1、衔接其它字符流与下面的字节流
 *   2、字符与字节的转换由转换流完成
 *
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        /**
         *      字符输出流提供了write方法是以字符为单位的，并且也提供了直接写出一个字符串的方法
         * */
        osw.write("你好，OutputStreamWriter!\n");
        osw.write("你好, InputStreamReader!我们的超类是Reader和Writer\n");
        System.out.println("OVER！");
        osw.close();
    }
}
