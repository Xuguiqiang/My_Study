package any_test.test2_1;

import java.io.*;
import java.util.Scanner;

/**
 * @author Xgq
 * @date 2021/11/519:57
 * @Title Test
 * @Package Test
 * @Description 周测测试类
 */
public class Test {
    public static void main(String[] args) {
        String name,sex,desc;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        name = scanner.nextLine();
        System.out.println("请输入年龄:");
        age = scanner.nextInt();
        System.out.println("请输入性别：");
        sex = scanner.nextLine();
        System.out.println("请输入个人描述：");
        desc = scanner.nextLine();
        Person person = new Person(name,age,sex,desc);
        try(
                FileOutputStream fos = new FileOutputStream("person.obj",false);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream("person.obj");
                ObjectInputStream ois = new ObjectInputStream(fis);
                ){
            oos.writeObject(person);
            System.out.println("写入完毕！");
            Person p = (Person) ois.readObject();
            System.out.println(p);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
