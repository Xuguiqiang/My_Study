package file;

import java.io.File;
import java.io.IOException;

/**
 * @author Xgq
 * @date 2021/10/2914:12
 * @Title CreateNewFile
 * @Package API File
 * @Description 创建一个新文件
 */
public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc");
        if(file.exists()){
            System.out.println(file.getName()+"文件已经存在!");
        }else{
            file.createNewFile();
            System.out.println(file.getName()+"已经创建！");
        }
    }
}
