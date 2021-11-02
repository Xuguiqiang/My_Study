package Io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

/**
 * @author Xgq
 * @date 2021/11/210:10
 * @Title OISDemo
 * @Package API File
 * @Description 对象反序列化操作
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("./person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        /**
         * 反序列化时可能会出现以下异常：
         * java.io.InvalidClassException
         * 原因： 读取的这个对象的版本号与当前Person类的版本不一致造成的
         * 这是因为该对象写入文件后，Person类被修改过，所以文件内对象的版本号与当前类的版本号就不一致了
         * 解决：
         * 可以自行指定Person的版本号，这样一来就算Person类被修改过，我们不修改版本号，那以前版本号创建出来的对象还是可以读取回来。
         * 系统会自动生成版本号，导致该类只要被修改过版本号就一定会改变！
         *
         * */

        Person p = (Person) ois.readObject();
        System.out.println(p);
        ois.close();
    }
}
