package string;

/**
 * @author Xgq
 * @date 2021/10/3014:05
 * @Title StringBuilderTest
 * @Package API StringBuilder
 * @Description StringBuilder练习测试
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String str;
        /**
         * for (int i = 0; i<10000000; i++){
         *             str += "a";
         *         }
         * System.out.println("程序运行结束！");
         *  以上程度的运行效率和性能非常的低，只要涉及到对字符串大量的操作，使用StringBuilder
         */
        /**
         * StringBuilder builder = new StringBuilder(str);  把字符串赋值给StringBuilder，再进行操作，性能大幅度提升
         *builder.append("bcd");
         *System.out.println(builder);
         *builder.delete(0, 2);
         *System.out.println(builder);
         *builder.insert(1, "ef");
         *System.out.println(builder);
         *System.out.println(builder.charAt(2));
         *System.out.println(builder.replace(0, 2, "AB"));
         *System.out.println(builder.reverse());
         *
         * */
        /**
         * for (int i = 0; i < 10000000; i++){
         *             builder.append("a");
         *         }
         * 程序执行完成速度大幅提升
         * */

        /**
         *    需求： 用户需要自己输入字符串来进行高效的字符串处理，用户要按需进行增，删，插，改操作！
         *
         * */

    }
}
