package integer;

/**
 * @author Xgq
 * @date 2021/10/299:25
 * @Title IntegerDemo1
 * @Package API Integer
 * @Description Integer类
 *
 *    包装类
 *    Java提供了8个包装类，分别对应8个基本类型
 *    由于基本类型是以值而非对象形式存在，没有面向对象的特性，为了让基本类型可以参与面向对象开发，出现了8个包装类，目的是让基本类型可以
 *  以对象形式表示
 *
 *    基本类型
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        int num = 128;
        String string = "128";

        /**
         *    Java建议用 valueof()方法来包装整形数据
         *    其值范围是 -128 到 127
         * */
        Integer i1 = Integer.valueOf(num);     /** 等同于 Integer i1 = new Integer(num); */
        Integer i2 = Integer.valueOf(num);
        Integer i5 = Integer.valueOf(string);
        System.out.println(i5.intValue());
        System.out.println(i1 == i2);          /** true , 存在于常量池中，两个引用都相等  */
        System.out.println(i1.equals(i2));     /** true , 其指向的内容是一样的    */


        Integer i3 = new Integer(num);     /** 创建包装类对象 */
        Integer i4 = new Integer(num);
        System.out.println(i3 == i4);      /** false, 所指向的地址是不同的 */
        System.out.println(i3.equals(i4)); /** true , 对象的内容是一样的 */

        double dou = 123.123;
        Double d1 = Double.valueOf(dou);
        Double d2 = Double.valueOf(dou);
        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));

        /**
         * 数字类型的包装类都支持将其表示的数字以基本类型返回
         * 注意：与基本类型的赋值一样，小类型赋值大类型可直接赋值，大类型向小类型赋值可能丢失精度
         * */
        int in = i1.intValue();
        System.out.println(in);
        double dd = d1.doubleValue();
        System.out.println(dd);

        /** 获取各个类型的最大值最小值 ， 包装类中定义了两个常量，MAX_VALUE,MIN_VALUE可心获取最大最小值  */
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);
        double dmax = Double.MAX_VALUE;
        double dmin = Double.MIN_VALUE;
        System.out.println(dmax);
        System.out.println(dmin);

        /**
         * 包装类型中，可以将字符串解析为对应的基本类型，前提是该字符串正确描述了基本类型可以接收的值
         * */
        String s1 = "123";
        int num1 = Integer.parseInt(s1);  //如果 s1的值为 "123.123",则不符合int类型，报 NumberFormatException 异常
        System.out.println(num1);
        String s2 = "123.123";
        double ds1 = Double.parseDouble(s2);
        double ds2 = Integer.parseInt(s1);
        System.out.println(ds1);
        System.out.println(ds2);

    }
}
