package day05homework;

import java.io.*;

/**
 * @author Xgq
 * @date 2021/11/219:54
 * @Title Test1
 * @Package homework
 * @Description homework
 *
 * 复制文件
 *
 * public class Test01 {
 * 	public static void main(String[] args) throws IOException {
 * //		FileInputStream fis
 * //	= new FileInputStream("test.txt");
 * //		FileOutputStream fos
 * //		= new FIleOutputStream("test_cp.txt");
 * //
 * //		   int d;
 * //				while((d = fis.read())!=-1) {
 * //				fos.write(d);
 * //					}
 * //				System.out.println("复制完毕!");
 * //					fis.close();
 * //	fos.close();
 *        }
 * }
 *
 *
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.jpg");
        FileOutputStream fos = new FileOutputStream("day05_homework_cp.jpg");
        int d ;
        while ((d = fis.read()) != -1){
            fos.write(d);
        }
        System.out.println("复制完成！");
        fis.close();
        fos.close();
    }
}
