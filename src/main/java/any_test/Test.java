package any_test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Xgq
 * @date 2021/11/118:54
 * @Title Test
 * @Package Any Test
 * @Description 所有的测试
 */
public class Test {
//    public static void main(String[] args) {
//        Date date = new Date();
//        SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String str = formate.format(date);
//        System.out.println(str);
//    }
}
class Boxer {
    Integer i;
    int x;
    public Boxer(int y) {
        x = i + y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        new Boxer(new Integer(4));

    }
}

class A{

}
class B extends A{

}
class C extends A{

}
class D{
    A o1 = new A();
    A o2 = new B();
    A o3 = new C();
    A a = o1 ;  B b = (B) o2; C c = (C) o3;
}