package file;

import java.io.File;
import java.io.FileFilter;
import java.util.logging.Filter;

/**
 * @author Xgq
 * @date 2021/10/2917:21
 * @Title LambdaDemo
 * @Package API File
 * @Description lambda表达式
 *
 * JDK8之后推出一个新的特性，lambda表达式
 * 它可以让java编写面向函数式编程
 * 给我们最直观的感受是可以用更精简的方语法定义匿名内部类
 *  语法：
 *      （参数列表）->{
 *          方法体
 *      }
 * 注意：使用lambda表达式创匿名内部类时实现的接口中只能有一个抽象方法
 */
public class LambdaDemo {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            FileFilter filter = (File f)->{
                return f.getName().contains("a");
            };
            File[] file = dir.listFiles(filter);
            for (int i = 0; i < file.length; i ++){
                System.out.println(file[i].getName());
            }
        }

        if(dir.isDirectory()){
            FileFilter filter = f->{
                return f.getName().contains("a");
            };
        }
        /** 精简 */
        if(dir.isDirectory()){
           // FileFilter filter = f -> f.getName().contains("a");
            File[] file = dir.listFiles(f -> f.getName().contains("a"));
        }
    }
}
