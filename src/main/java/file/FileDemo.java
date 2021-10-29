package file;

import java.io.File;

/**
 * @author Xgq
 * @date 2021/10/2911:35
 * @Title FileDemo
 * @Package API File
 * @Description 文件演示
 *
 * java.in.File
 * File 表示文件系统中的一个文件或目录（实际上表示的是一个路径）
 * 通过File我们可以：
 *  1.访问文件或者目录的属性
 *  2.创建和删除文件或目录
 *  3.访问一个目录中的所有子项
 * 但是不能访问文件数据（由其它API负责）
 */
public class FileDemo {
    public static void main(String[] args) {
        /**
         * 创建File时要指定路径，这里的路径通常使用相对路径，他有更好的跨平台性
         * 常见的相对路径： "./" 称为当前目录，具体在哪里要视频程序的运行环境而定
         * */
        File file = new File("./src/main/java/file/demo");

        System.out.println(file.getName()); /** 文件名 */
        System.out.println(file.length());  /** 长度的类型为 long */
        System.out.println(file.canRead()); /** 判断可读 */
        System.out.println(file.canWrite());/** 判断可写 */
        System.out.println(file.isHidden());/** 判断是否隐藏 */
    }
}
