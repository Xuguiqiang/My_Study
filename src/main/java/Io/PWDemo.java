package Io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author Xgq
 * @date 2021/11/214:02
 * @Title PWDemo
 * @Package API File
 * @Description 缓冲字符输出流
 *
 *   java.io.BufferedWriter 和 BufferedReader
 *
 *   java.io.PrintWriter
 *   具有自动刷新功能的缓冲字符输出流，内部总是连接BufferedWriter 作为缓冲加速功能
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /**
         *    向文件 pw.txt中写入文本信息
         *    PrintWriter 支持直接向文件写操作的构造器
         *    PrintWriter(String fileName)
         *    PrintWriter(File fileName)
         *
         * */
        PrintWriter pw = new PrintWriter("./pw.txt","UTF-8");
        pw.println("夜空中最亮的星，能否听清，");
        pw.println("那仰望的人，心底的孤独和叹息！");
        System.out.println("写入完毕！");
        pw.close();

    }
}
