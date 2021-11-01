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
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = formate.format(date);
        System.out.println(str);
    }
}
