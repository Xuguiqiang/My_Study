package Io;

import java.io.*;
import java.util.Scanner;

/**
 * @author Xgq
 * @date 2021/11/214:47
 * @Title NoteDemo
 * @Package API File
 * @Description 随堂练习
 *
 *   简易记事本工具
 *   程序启动后在控制台输入一个文件名，然后对该文件进行写操作
 *   之后再控制台输入的每行字符串都要按行写入到文件中
 *   当单独输入exit时，程序退出  exit不要写入文件
 *   要求自行创建连接流
 */
public class NoteDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("将在当前目录下创建一个文件：Note.txt");
        /**
         *
         * 创建PrintWriter时，如果第一个参数为流，第二个参数支持一个boolean值 autoFlush
         * 指定为true时则打开了自动刷新功能
         *
         * */
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./Note.txt",true),"UTF-8")),true);
        //PrintWriter pw = new PrintWriter("Note.txt","UTF-8");
        Scanner scan = new Scanner(System.in);
        System.out.print("请写入文件,当输入为exit时,将自动退出 ：");
        while (true){
            String str = scan.next();
            if ("exit".equals(str)){
                break;
            }
            pw.println(str);
            System.out.print("写入成功,继续请输入,结束请输入exit:");
        }
        pw.close();
    }
}
