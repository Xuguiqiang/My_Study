package Io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Xgq
 * @date 2021/11/19:21
 * @Title FOSDemo
 * @Package API Stream
 * @Description 流
 *
 *  JAVA IO 输入与输出
 *  Java 按照输入与输出方向划分两个操作： 读和写
 *  输入是用来读取的，是从外界输入到程序中的方向
 *  输出是用来向外界写的
 *
 *  java将输入与输出比喻为“流（Stream）”，即：向同一侧顺序移动的过程
 *  并且定义了两个超类
 *  java.io.InputStream:输入流
 *  里面规定了所有字节输入流的读取方法。将来实际读取不同设备的输入流都继承至它，因此都会有这里定义的读取操作，使得
 *  程序员可以用相同的方式读取不同设备
 *
 *  java.io.OutputStream:输出流。所有字节输出流都继承自它，里面定义了写出字节的方法
 *
 *  文件流
 *  java.io.FileInputStream 和 java.io.FileOutpuStream
 *  它们继承自InputStream和OutputStream.用来连接文件，进行读写文件数据的流
 *
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 文件输出流提供了两种构造方法
         * 需要注释：如果指定的文件不存在会自动创建，前提是此文件所有的目录必须存在
         * */
        FileOutputStream fos = new FileOutputStream("./fos.dat");
        /**
         *         void write(int b)
         *        将给定的int值对应的2进制的“低八位”写入文件
         * */
        fos.write(1);
        fos.write(65);
        System.out.println("写入完毕！");
        fos.close();
    }
}
