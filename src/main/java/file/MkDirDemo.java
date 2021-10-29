package file;

import java.io.File;

/**
 * @author Xgq
 * @date 2021/10/2914:39
 * @Title MkDirDemo
 * @Package API File
 * @Description 创建目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        File dir = new File("test"); /** 相对路径中，"./"可以忽略不写，默认就是从"./"开始的 */
        if (dir.exists()){
            System.out.println("该目录已经存在！");
        }else{
            dir.mkdirs();  /** mkdir()表示要创建的目录路径要全部存在。 mkdirs() 会将不存在的父目录全部创建出来 */
            System.out.println("目录已经创建！");
        }
    }
}
