package file;

import java.io.File;

/**
 * @author Xgq
 * @date 2021/10/2915:21
 * @Title DeleteDirDemo
 * @Package API File
 * @Description 目录的删除
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir = new File("test");
        if (dir.exists()){
            dir.delete();
            System.out.println("目录已经删除");
        }else{
            System.out.println("目录？不存在的！");
        }
    }
}
