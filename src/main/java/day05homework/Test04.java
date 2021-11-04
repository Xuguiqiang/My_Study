package day05homework;

import java.io.*;

/**
 * 将当前目录下的所有obj文件获取到，并进行
 * 反序列化后输出每个用户的信息(直接输出反序
 * 列化后的User对象即可)
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        File file = new File(".");
        if (file.isDirectory()){
            /*File[] sub = file.listFiles(new FileFilter() {
                public boolean accept(File pathname) {
                    return pathname.getName().endsWith(".obj");
                }
            });*/
            File[] sub = file.listFiles(pathname -> pathname.getName().endsWith(".obj"));
           for (int i = 0; i < sub.length; i ++){
               try(
                       FileInputStream fis = new FileInputStream(sub[i]);
                       ObjectInputStream ois = new ObjectInputStream(fis);

                       ){
                   Object obj = ois.readObject();
                   if (obj instanceof User){
                       User user = (User) obj;
                       System.out.println(user);
                   }
               }catch (IOException | ClassNotFoundException e){
                   e.printStackTrace();
               }
               }
           }
        }
    }

/*
    提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，
	//【获取当前目录所有文件】
    File dir = new File(".");

    //【获取所有的文件】
    for(int i=0;i<subs.length;i++){

    }

    //【获取以.obj的文件到subs】
    File[] subs = dir.listFiles((f)->f.getName().endsWith(".obj"));

    //【创建文件字节流】
    FileInputStream fis = new FileInputStream(sub);

    //【获取数组中的文件】
    File sub = subs[i];//从数组中获取每一个obj文件

    //【输出文件】
    System.out.println(user);

    //【创建序列化流】
    ObjectInputStream ois = new ObjectInputStream(fis);

    //【强制将类型转换一致】
    User user = (User)obj;

    //【反序列化】
    Object obj = ois.readObject();

    //【判断是否为相同类型】
    if(obj instanceof User){

    }

 */