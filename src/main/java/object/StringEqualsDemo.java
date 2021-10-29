package object;

/**
 * @author Xgq
 * @date 2021/10/299:09
 * @Title StringEqualsDemo
 * @Package API
 * @Description equals的用法
 *
 * 　Java提供的类大多数都重写了equals方法，用来比较对象内容
 *  比如String,String 在比较内容格式的时候一定还是要用equals方法
 */
public class StringEqualsDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";  /**   相同的字符串创建的时候会重用对象   */

        System.out.println(s1 == s2); /**   true 因为s1 和 s2 都是指向的是字符串常量池   */
        System.out.println(s1.equals(s2)); /**   true , equals比较的是两个变量的内容   */

        String s3 = new String("abc");
        System.out.println(s1 == s3);  /**   false 指向的不是同一个常量池，即使是内容相同   */
        System.out.println(s2.equals(s3));
    }
}
