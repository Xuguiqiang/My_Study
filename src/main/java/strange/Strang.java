package strange;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Xgq
 * @date 2021/11/116:34
 * @Title Strange
 * @Package Any Class
 * @Description 不熟悉的知识点记录 FileInputStream FileOutputStream
 *
 *  以 D:/user/Desktop/徐贵强/陌生点/陌生知识点.txt 路径文件记录java学习中遇到的问题
 */
public class Strang {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:/user/Desktop/徐贵强/陌生点/陌生知识点.txt")));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/user/Desktop/徐贵强/陌生点/陌生知识点.txt",true),"UTF-8")),true);
        int con;
        do{
            System.out.print("1.查看所有的难点\n2.输入记录难点\n3.退出\n请选择要进行的操作:");
            con = scan.nextInt();
            switch (con){
                case 1:
                    String line;
                    while ((line = br.readLine()) != null){
                        System.out.println(line);
                    }
                    break;
                case 2:
                    System.out.print("请输入要记录的难点:");
                    String str = scan.next();
                    String time = format.format(date);
                    pw.println(time+" "+str);
                    break;
                default:
                    System.out.println("输入无法识别！");
            }
        }while (con != 3);
        br.close();
        pw.close();
    }
}
