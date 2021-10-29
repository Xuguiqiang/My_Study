package file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Xgq
 * @date 2021/10/2916:25
 * @Title ListFileDemo2
 * @Package API File
 * @Description 读取当前目录所有的子项
 */
public class ListFileDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String filename = pathname.getName();
                    System.out.println("正在过滤："+filename);
                    return filename.startsWith(".");
                }
            };
            File[] sub = dir.listFiles(filter);
            System.out.println("满足以.开头的文件数量为："+sub.length);
            for (int i = 0; i < sub.length; i ++){
                System.out.println(sub[i].getName());
            }
        }
    }
}
