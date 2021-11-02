package Io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Xgq
 * @date 2021/11/29:22
 * @Title OOSDemo
 * @Package ObjectStream
 * @Description 对象流
 *
 * 对象流
 * java.io.ObjectInputStream和ObjectOutputStream
 * 对象流是高级流，在流连接中的作用是：进行对象序列化与反序列化
 * 对象序列化：将一个对象按照其结构转换为一组字节的过程
 * 对象反序列化：将一组字节（必须是序列化的一组字节）还原为一个对象的过程
 *
 * 因此，有了对象流，可以很方便的读写任何java对象
 *
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "小泽老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"是个演员","会唱歌","会跳舞","启蒙老师"};
        Person p = new Person(name,age,gender,otherInfo);

        FileOutputStream fos = new FileOutputStream("./person.obj",false);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /**
         * 对象输出流在进行对象序列化时要求写出的对象必须实现可序列化接口
         * 否则抛出异常：java.io.NotSerializableException
         *
         * 序列化接口：Serializable
         * */
        oos.writeObject(p);
        System.out.println("写入完毕！");
        oos.close();

    }
}
