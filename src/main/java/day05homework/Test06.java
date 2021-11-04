package day05homework;

import java.io.*;

/**
 * 扫描指定目录中的所有.java文件，并将内容全部输出到控制台
 *
 * 例如将当前项目目录下./src/main/java/io目录中的所有java文件内容输出
 * 到控制台
 *
 * 1:先要定位./src/main/java/io目录(哪个API用来描述目录?)
 * 2:获取该目录下的所有.java文件
 * 3:遍历每一个java文件，然后按行读取里面的每一行字符串
 *   并输出控制台
 *
 *
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File file = new File("./src/main/java/file");
        if (file.isDirectory()){
            File[] sub = file.listFiles(pathname -> pathname.getName().endsWith(".java"));
            for (int i = 0; i < sub.length;i ++){
                System.out.println("读取："+sub[i].getName());
                try(
                        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(sub[i]),"UTF-8"));
                        ){
                    String line;
                    while ((line = br.readLine()) != null){
                        System.out.println(line);
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


        /**
         * File dir = new File("./src/main/java/io");
         *         //获取该目录下的所有.java文件
         *         File[] subs = dir.listFiles(f->f.getName().endsWith(".java"));
         *         for(int i=0;i<subs.length;i++){
         *             File file = subs[i];
         *             System.out.println("正在读取文件:"+file.getName());
         *             try(
         *                 FileInputStream fis = new FileInputStream(file);
         *                 InputStreamReader isr = new InputStreamReader(fis);
         *                 BufferedReader br = new BufferedReader(isr);
         *             ) {
         *                 String line;
         *                 while ((line = br.readLine()) != null) {
         *                     System.out.println(line);
         *                 }
         *             }catch (IOException e){
         *                 e.printStackTrace();
         *             }
         *         }
         * */

    }
}

/*
    提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，

    //【循环获取每个文件】
    for(int i=0;i<subs.length;i++){

    }
    //【循环判断是否读到文件末尾】
    while((line = br.readLine())!=null){

    }

    //【得到一个文件】
    File sub = subs[i];

    //【优化和转换流】
    BufferedReader br = new BufferedReader(
           new InputStreamReader(
                  new FileInputStream(sub)
           )
    );

    //【获取路径】
    File dir = new File("./src/main/java/io");

    //【按行输出】
    System.out.println(line);

    //【获取行用来判断】
    String line;

    //【过滤.java文件】
    File[] subs = dir.listFiles(f->f.getName().endsWith(".java"));
 */
