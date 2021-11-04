package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Xgq
 * @date 2021/11/39:03
 * @Title FinallDemo
 * @Package API Exception
 * @Description 异常
 *
 *  finally 块是异常处理机制中的最后一块，它可以直接跟在try语句块后或最后一个catch语句后
 *  finally可以保证无论try语句是否抛出异常finally都必定执行
 *
 *  因此，一般都会将释放资源之类的操作放在finally中确保执行，例如IO操作后的close调用
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始执行了！");
        try {
            String str = "ab";
            System.out.println(Integer.parseInt(str));
            return;  /**  finally执行后， 方法才会真正的返回结束  */
        }catch (Exception e){
            System.out.println("有程序异常！");
        }finally {
            System.out.println("finally被执行！");
        }
        System.out.println("程序结束！");
    }
}
