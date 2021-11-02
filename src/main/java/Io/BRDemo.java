package Io;

import javax.activation.MailcapCommandMap;
import java.io.*;

/**
 * @author Xgq
 * @date 2021/11/216:03
 * @Title BRDemo
 * @Package API File
 * @Description 缓冲字符输入流按行读取字符串
 *
 *
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/java/Io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null){ /** 读取一行，读到空行则返回一个空字符串，读到末尾返回 null  */
            System.out.println(line);
        }
    }
}
