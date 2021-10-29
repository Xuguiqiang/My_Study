package file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Xgq
 * @date 2021/10/2916:53
 * @Title Test
 * @Package API File
 * @Description 查找当前文件中含有字母a的文件名
 */
public class Test {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String filename = pathname.getName();
                    if(filename.indexOf('a')!= -1){
                        return true;
                    }else{
                        return false;
                    }
                }
            };
            File[] listfile = dir.listFiles(filter);
            for (int i =0;i < listfile.length; i ++){
                System.out.println(listfile[i].getName());
            }
        }
    }
}
