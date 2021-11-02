package Io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Xgq
 * @date 2021/11/29:11
 * @Title Person
 * @Package API File
 * @Description 使用当前类测试对象流的对象序列化与反序列化操作
 */
public class Person implements Serializable {
    public static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String gender;
    private transient String[] otherInfo; /** transient 属性的意思是在序列化时不被写入文件，可减少资源开销。在类实现了Serialzable接口后才有意义 */

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
