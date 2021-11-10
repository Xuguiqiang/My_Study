package file;

import java.io.File;
import java.io.FileFilter;
import java.util.Collection;

/**
 * @author Xgq
 * @date 2021/11/1020:04
 * @Title DirectoryManagement
 * @Package API File,Stream And So On
 * @Description 目录管理
 *                    学习编写一个目录管理类，实现可浏览、输出当前所有的目录，以及查看任何目录下的文件
 */
public class DirectoryManagement {
    public static void main(String[] args) {
        File file = new File("./");
        if (file.isDirectory()){
            System.out.println(file.length());
        }
    }
}
