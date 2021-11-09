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

    private String str = "tedu";
    public  void changes(String str,char ch[]){
        str = "tarena";
        ch[0] = 'w';
    }

    public static void main(String[] args) {
        char[] ch = {'x','y','z'};
        Test t = new Test();
        t.changes(t.str,ch);
        System.out.println(t.str+"and");
    }
}