package string;

/**
 * @author Xgq
 * @date 2021/10/2815:35
 * @Title ReplaceAllDemo
 * @Package API
 * @Description String 支持正则表达式三，替换为指定内容
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "aadffads15fad4adf2ffadsf54156afd1fads";

        /**  按 regex 将字符串str按正则表达式的匹配规则进行替换   */
        str = str.replaceAll("[0-9]","数字");
        System.out.println(str);

        String str1 = "abcdefg123456.a14b";
        str1 = str1.replaceAll("[a-z]+","K");
        System.out.println(str1);
    }
}
