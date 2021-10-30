package file;

import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Xgq
 * @date 2021/10/3014:55
 * @Title FileFilterTest
 * @Package API FileFilter
 * @Description FileFilter文件过滤练习测试
 */
public class FileFilterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("test.java");
        if (file.exists()){
            System.out.println("名称："+file.getName()+"已经存在！");
        }else{
            file.createNewFile();
            System.out.println("文件已经创建成功！");
        }

        /** 文件过滤器 */
        File dir = new File(".");
        if (dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().indexOf("i") != -1;
                }
            };
            File[] sub = dir.listFiles(filter);
            for (int i = 0;i < sub.length;i ++){
                System.out.println(sub[i].getName());
            }
        }
    }
}
