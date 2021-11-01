package strange;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
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
        File file = new File("D:/user/Desktop/徐贵强/陌生点/陌生知识点.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream(file,true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] data ={};
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("1.查看所有\n2.录入知识点\n3.退出\n请输入：");
        int con = scan.nextInt();
        while (con != 3){
            if(con <1 && con >3){
                break;
            }
            switch (con){
                case 1:
                    byte[] data1 = new byte[bis.available()];
                    bis.read(data1);
                    String str1 = new String(data1,"UTF-8");
                    System.out.println(str1);
                    break;
                case 2:
                    System.out.print("请输入知识点：");
                    str = scan.next()+"\n";
                    str = format.format(date)+" : "+str;
                    data = str.getBytes(StandardCharsets.UTF_8);
                    bos.write(data);
                    bos.flush();
                    System.out.println("已经成功录入！");
                    break;
            }
            System.out.print("1.查看所有\n2.录入知识点\n3.退出\n请输入：");
            con = scan.nextInt();
        }
        bis.close();
        bos.close();
    }
}
