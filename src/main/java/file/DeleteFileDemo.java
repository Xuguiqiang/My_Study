package file;

import java.io.File;

/**
 * @author Xgq
 * @date 2021/10/2914:27
 * @Title DeleteFileDemo
 * @Package API File
 * @Description 删除文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("test.java");
        if (file.exists()){
            file.delete();
            System.out.println("文件已经删除！");
        }else{
            System.out.println("文件？不存在的！");
        }
    }
}
