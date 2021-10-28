package string;

/**
 * @author Xgq
 * @date 2021/10/2810:32
 * @Title StringBuiderDemo
 * @Package string
 * @Description String不适合频繁的修改，内存开销大，性能低下，此时API StringBuilder
 * @company Tedu
 *
 * StringBuilder内部维护一个可变的char数组，修改性能高，开销小。并且提供了便于修改字符串的相关操作：增删改插等
 * StringBuilder 对字符串的操作性能远高于直接操作String,频繁的字符串操作请直接使用此类
 * StringBuffer 跟 StringBuilder 功能跟使用方法完全一样， StringBuffer是线程安全的，多线程中使用，非多线程使用StringBuilder
 *
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习JAVA";
        /**
         * StringBuilder被创建的同时，给定的字符串内容将被复制，原因是str字符串变量本身是不能修改的，若没有给定内容则调用的是默认构造：空字符串
         * */
        StringBuilder builder = new StringBuilder(str);
        System.out.println(str);               /**  输出：好好学习JAVA ， 可见str的值是没有被改变，验证了字符串变量本身是不可改变的  */

        /** 此是builder是给指定的str字符串增加了",为了找一份好工作",改变的是复制的内容而不是修改str  */
        builder.append("，为了找一份好工作");
        System.out.println(builder);

        /**  修改builder的值，从指定的下标9开始，到下标16（不包含16）替换为指定字符串  输出： 好好学习JAVA，就是为了改变世界作  */
        builder.replace(9,16,"就是为了改变世界");
        System.out.println(builder);

        /**删除builder从下标0开始到8（不包含8）下标中的字符   输出: ,就是为了改变世界作 */
        builder.delete(0,8);
        System.out.println(builder);

        /**向builder中从下标0开始 插入指定的字符  输出： 活着，就是为了改变世界作 */
        builder.insert(0,"活着");
        System.out.println(builder);

        /**将builder中的字符串进行反转 输出： 作界世变改了为是就，着活 */
        builder.reverse();
        System.out.println(builder);

        /**StringBuilder只是字符串的工具类，并不是字符串本身。
         * 当使用了StringBuilder数修改完了字符串以后，可以通过StringBuilder toString()方法来获取到其内部的字符串内容
         * 输出： 作界世变改了为是就，着活
         * */
        String line = builder.toString();
        System.out.println(line);
        double pi = 3.141594523;

    }
}
