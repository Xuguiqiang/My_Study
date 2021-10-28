package string;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Xgq
 * @date 2021/10/2815:06
 * @Title SplitDemo
 * @Package API
 * @Description 正则表达式方法二 字符串的拆分
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = ",adfa,,,,df14,616,5adf,56,a6,5a,dsf,,,,,";

        /**  以下方法实现了按数字部分进行拆分，得到所有的字母部分   */
        String[] data = str.split("[0-9]+");
        System.out.println(Arrays.toString(data));
        for (int i = 0; i< data.length; i++){
            System.out.print("第"+(i+1)+"个字符串："+data[i]+"\t");
        }
        System.out.println();
        /**  以下方法实现了按','进行拆分，得到除逗号以外所有的字母
         *   注意： 如果在字符串末尾连续出现可拆分项，拆分出来的空字符串将会被忽略
         * */
        data = str.split(","); /**  注意“.”的拆分操作，点 表示所有的字符， 拆点应该为 “\\.”  */
        System.out.println(Arrays.toString(data));
        for (int i = 0; i< data.length; i++){
            System.out.print("第"+(i+1)+"个字符串："+data[i]+"\t");
        }
    }
}
