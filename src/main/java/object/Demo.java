package object;

/**
 * @author Xgq
 * @date 2021/10/2816:45
 * @Title Demo
 * @Package API
 * @Description 测试重写Object类中的toString 和 equals 方法
 */
public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        /**
         *   向控制台输出一个对象时，该方法会输出该对象toString方法返回的字符串,默认为：
         */
        System.out.println(p);
        System.out.println(p.toString());
        System.out.println("对象内容为："+p);

        /**
         *   Object定义的另一个被子类重写的方法：equals
         *   该方法的作用是判断两个相同类型的实例对象之间内容是否相同
         *   == 为值比较，比较的是两个变量的值是否相等
         *   对于引用而言，其保存的是地址，因此 == 可以理解为比较两个对象的地址是否相同，意味着比较的是它们是否为同一对象
         * */
        Point p2 = new Point(1,2);
        System.out.println(p == p2);

        /**
         *   equals 方法并不关心两个对象是否为同一对象，而是关心两个的内容是否相同，Object定义的方法内部是用 == 实现的，所以实际应用中应当重写该方法，否则没有意义
         * */
        System.out.println(p.equals(p2));
    }
}
