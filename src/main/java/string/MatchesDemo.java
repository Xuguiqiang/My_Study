package string;

import java.util.Scanner;

/**
 * @author Xgq
 * @date 2021/10/2814:26
 * @Title MatchesDemo
 * @Package API
 * @Description 正则表达式
 *
 * 字符串支持正则表达式之一
 * boolean matches(String regex)
 * 使用给定的正则表达式匹配当前字符串内容是否符合格式要求，符合则返回true
 */
public class MatchesDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**   regex邮箱的正则表达式 [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z])+   */
        String email = "xuguiqiang@qq.com";
        String regex = "[a-zA-Z0-9_]+@[A-Za-z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = email.matches(regex);
        if (match){
            System.out.println("是邮箱");
        }else{
            System.out.println("不是邮箱");
        }

        System.out.println("请输入1开启邮箱验证：");
        int i = scan.nextInt();

    }
}
