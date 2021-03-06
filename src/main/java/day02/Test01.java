package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 正则表达式练习:
 * 1:编写匹配数字的正则表达式,数字至少一位以上.
 * 
 * 2:匹配字符串,要求输入3-15位,内容只能是数字,字母下,划线
 *
 * 
 * 完成下面编程题:
 * 程序启动后,要求用户输入用户名,用户名出现内容要求上述正则表达式2的要求.不匹配则直接
 * 提示用户名有误.
 * 如果无误,则要求用户继续输入年龄,规则为上述正则表达式1的要求,不匹配则提示年龄有误
 * 以上两个输入获取是都要求以字符串形式接受(Scanner的nextLine方法获取)
 * 
 * 最后验证年龄在1-100岁之间(包含1和100)
 * 提示:这里可以不用正则表达式验证范围,是否转换为数字判定更方便?
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		String str = "adfasd15646afafdadf1af54fad4ad5adf6";
		String regex = "[0-9]+";  /**  从0到9的多个数字  */
		String[] ch = str.split(regex);  /**   从给定的字符串中拆分全部数字   */
		System.out.println(Arrays.toString(ch));

		/**
		 *    匹配字符串,要求输入3-15位,内容只能是数字,字母下,划线
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入字符串：");
		String s = scan.next();
		String regex1 = "[a-z0-9_]+";
		while (true){
			if (s.equals("t")){
				break;
			}else{
				if (s.matches(regex1) && s.length()>=3){
					System.out.println("符合要求！");
					System.out.print("继续验证请继续，只能是字母数字下划线，退出输入t:");
					s = scan.next();
				}else{
					System.out.println("不符合要求！");
					System.out.print("继续验证请继续，只能是字母数字下划线，退出输入t:");
					s = scan.next();
				}
			}
		}
	}
}





