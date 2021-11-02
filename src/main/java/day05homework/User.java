package day05homework;

import java.io.Serializable;

/**
 * @author Xgq
 * @date 2021/11/220:12
 * @Title
 * @Package
 * @Description
 *
 *        设计一个类:User
 *  *  * 里面有四个属性:String name,String pwd,String nick,int age
 *  *  * 定义get,set方法以及toString方法和构造方法
 *  *  *
 *  *  * 单词记一记:
 *  *  * pwd   是单词password的缩写，是密码的意思
 *  *  * user  用户
 */
public class User implements Serializable {
    public static final long serialVersionUID = 1l;

    private String name;
    private String pwd;
    private String nick;
    private int age;

    public User(String name, String pwd, String nick, int age) {
        this.name = name;
        this.pwd = pwd;
        this.nick = nick;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }
}
