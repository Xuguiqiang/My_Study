package day05homework;

import java.io.*;

/**
 * @author Xgq
 * @date 2021/11/220:02
 * @Title Test2
 * @Package day05_homework
 * @Description 使用缓冲流复制文件
 *
 *
 * 改错
 *
 *public class Test02 {
 * 	public static void main(String[] args) throws FileNotFoundException {
 * //			FileInputStream fis = new FileInputStream("test.txt");
 * //		BufferedInputStream bis = new BufferedInputStream(fis);
 * //
 * //	FileOutputStream fos = new FileOutputStream("test_cp.txt");
 * //			BufferedOutStream bos = new BufferedOutputStream(fos);
 * //
 * //	int d =0;
 * //	while((d = bis.read()) != -1) {
 * //		bos.write(d);
 * //	}
 * //	System.out.println("复制完毕!");
 *      bis.close();
 *      bos.close()
 *        }
 * }
 *
 *
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("day05_homework_cp.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int d ;
        while ((d = bis.read()) != -1){
            bos.write(d);
        }
        System.out.println("复制完成！");
        bos.close();
        bis.close();
    }
}
