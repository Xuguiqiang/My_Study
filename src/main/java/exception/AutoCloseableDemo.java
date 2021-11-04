package exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Xgq
 * @date 2021/11/39:47
 * @Title AutoCloseableDemo
 * @Package API Exception
 * @Description 自动关闭
 *
 *   JDK 7 之后 推出一个新的特性：自动关闭特性
 *   使得我们在IO操作中使用异常处理机制关闭流这类操作的代码书写得到简化
 *   语法
 *   try(
 *       定义需要在finally中调用 close()关闭流
 *   ){
 *       IO操作
 *   }catch(XXXException e){
 *       ...
 *   }
 */
public class AutoCloseableDemo {
    public static void main(String[] args) {
        try(
                /**
                 *
                 *   只有实现了AutoClosable接口的类才可以在这里定义并且初始化
                 *   编译器编译后会在finally中close它
                 *   相当于最终的代码会改为finallyDemo2.java中的样子
                 *
                 * */
                FileOutputStream fos = new FileOutputStream("fos.dat");
                ){
            String str = "abc";
            fos.write(str.getBytes(StandardCharsets.UTF_8));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
