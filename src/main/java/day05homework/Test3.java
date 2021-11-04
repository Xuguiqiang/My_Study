package day05homework;

import javax.sound.midi.Soundbank;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * @author Xgq
 * @date 2021/11/220:09
 * @Title Test3
 * @Package day05homework
 * @Description
 *
 *
 *  * 设计一个类:User
 *  * 里面有四个属性:String name,String pwd,String nick,int age
 *  * 定义get,set方法以及toString方法和构造方法
 *  *
 *  * 单词记一记:
 *  * pwd   是单词password的缩写，是密码的意思
 *  * user  用户
 *  *
 *  *
 *  * 当前程序启动后要求用户顺序输入以上四个信息
 *  * 然后实例化一个User对象保存着四个信息并将
 *  * 该对象序列化到文件中。
 *  * 文件名的命名规则:用户名.obj
 *  * 比如该用户输入用户名为张三，那么这个对象
 *  * 序列化后的文件名为:张三.obj
 *  *
 *  * 提高(选做):
 *  * 可以在用户输入信息后做必要的格式验证，比如4个信息是否
 *  * 都输入内容了。不能有空的。
 *  * 用户名只能包含字母数字下划线，并且1-32位
 */
public class Test3 {
    public static void main(String[] args) {
        String name = "";
        String pwd;
        String nick;
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入name:");
        name = scan.next();
        if(name.matches("[0-9a-zA-Z_]{1,32}")){
            System.out.print("请输入pwd:");
            pwd = scan.next();
            if(pwd.matches("[a-zA-Z0-9_]{1,32}")){
                System.out.print("请输入nick:");
                nick = scan.next();
                if (!"".equals(nick)){
                    System.out.print("请输入age:");
                    age = scan.nextInt();
                    if (age > 0 && age <= 100){
                        User user = new User(name,pwd,nick,age);
                        String obj_name = name+".obj";
                        try(
                                FileOutputStream fos = new FileOutputStream(obj_name);
                                ObjectOutputStream oos = new ObjectOutputStream(fos);
                                ){

                            oos.writeObject(user);
                            System.out.println("序列化完成！");
                        }catch (IOException e){
                            String mess = e.getMessage();
                            System.out.println(mess);
                        }
                    }else{
                        System.out.println("age不合法!");
                    }
                }else{
                    System.out.println("nick输入不合法！");
                }

            }else{
                System.out.println("PWD输入不合法！");
            }

        }else{
            System.out.println("输入的name不合法！");
        }

    }
}
