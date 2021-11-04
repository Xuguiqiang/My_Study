package exception;

/**
 * @author Xgq
 * @date 2021/11/311:00
 * @Title ThrowDemo
 * @Package API Exception Demo
 * @Description
 *
 *     异常的抛出
 *     throw关键字允许我们主动对外抛出一个异常，通常下列情况会如此：
 *     1。当前代码片段出现了一个异常，但是该异常不应当在当前代码片段中被解决时可对外抛出
 *     2。满足语法但是不满足业务逻辑里，可以将其当做异常抛出给调用者
 *
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            /**
             *     当我们调用一个含有throws声明的异常抛出方法时，编译器要求我们必须处理这个异常，处理方式有两种：
             *     1。主动try-cathc捕获并解决异常
             *     2。在当前方法上继续使用throws声明该异常的抛出
             *     具体使用哪个要结合实际业务分析异常处理的责任制问题。+
             * */
            p.setAge(1000); /**  p.setAge(1000) 满足语法规则，但不满足业务场景  */
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println("此人的年龄为："+p.getAge());
    }
}
