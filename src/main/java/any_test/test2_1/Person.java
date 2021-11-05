package any_test.test2_1;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

import java.io.Serializable;

/**
 * @author Xgq
 * @date 2021/11/519:52
 * @Title Person
 * @Package Test
 * @Description 周测
 */
public class Person implements Serializable {
    public static final long SerialVersionUID = 1L;
    private String name;
    private int age;
    private String sex;
    private transient String desc;
    public Person(){

    }

    public Person(String name, int age, String sex, String desc) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.desc = desc;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return name+","+age+","+sex+","+desc;
    }
}
