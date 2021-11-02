package Io;

import java.io.*;

/**
 * @author Xgq
 * @date 2021/11/214:27
 * @Title PWDemo2
 * @Package API File
 * @Description
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /**  低级流，负责向文件写入字节  */
        FileOutputStream fos = new FileOutputStream("./pw2.txt",false);
        /**  转换流（高级流）  */
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("你好！");
        pw.println("再见！");
        pw.close();
    }
}
