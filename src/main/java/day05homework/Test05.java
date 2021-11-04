package day05homework;

import java.io.*;

/**
 * 改正下面程序的错误
 *
 * 向文件testpw.txt中以UTF-8编码写入一行字符串：
 * 你好!我喜欢java!
 *
 * 单词记一记:
 * print 打印
 *
 * @author Xiloer
 *
 */
public class Test05 {
    //缺少main方法
    public static void main(String[] args) {
        try(
                PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("testPW.txt",false),"UTF-8")),true);
                ){
            pw.println("你好！我真的很喜欢java!");
        }catch (IOException e){
            e.printStackTrace();
        }

























        try (
                FileOutputStream fos = new FileOutputStream("testpw.txt");
            /*
                当指定的字符集名字拼写错误时会引发下面的异常
                java.io.UnsupportedEncodingException: UFT-8
                                                       ^你拼写错误的字符集
             */
                OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
                PrintWriter pw = new PrintWriter(bw);
        ){
            pw.println("你好!我喜欢java!");
            //类名拼写错误
//            system.out.println("写出完毕!");
            System.out.println("写出完毕!");
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("出错了!");
        }
    }

}
