package exception;

/**
 * @author Xgq
 * @date 2021/11/310:57
 * @Title Person
 * @Package API Exception Demo
 * @Description
 *
 *    演示异常的抛出
 *
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age < 0 || age > 120){
            //throw new RuntimeException("年龄不合法");
            throw new IllegalAgeException("年龄不合法");
            /**
             *    当使用throw主动对外抛出一个异常时，除了 RuntimeException异常，就必须用throws在方法上声明该异常的抛出以通知调用者处理此异常，否则编译不通过
             * */
        }
        this.age = age;
    }


}
