package file;

import java.io.File;

/**
 * @author Xgq
 * @date 2021/10/2915:43
 * @Title ListFileDemo
 * @Package API File
 * @Description 读取目录文件
 */
public class ListFileDemo {
    public static void main(String[] args) {
        File dir = new File("./");
        if (dir.isFile()){
            System.out.println("这是一个文件！");
        }
        if(dir.isDirectory()){
            System.out.println("这是一个目录！");
            File[] directory = dir.listFiles();
            for (int i =0; i < directory.length; i ++){
                File sub = directory[i];
                System.out.println(sub.getName());
            }
        }

    }
}
