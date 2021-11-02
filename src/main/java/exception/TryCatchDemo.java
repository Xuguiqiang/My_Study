package exception;

import java.io.InputStreamReader;

/**
 * @author Xgq
 * @date 2021/11/216:58
 * @Title TryCatchDemo
 * @Package exception
 * @Description 异常
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了！");
        String str = "";
        try {
            System.out.println(str.length());/**  str 值为null 空指针异常 NullPointException  */

            /**
             *
             *      注意以上语句出现异常，捕获异常后程序将从 try-catch语句后再开始执行 ！
             *
             * */

            System.out.println(str.charAt(0)); /** 返回数组中下标为0即第一个字符 ， 下标越界  */


        }catch (NullPointerException | StringIndexOutOfBoundsException e){

            System.out.println("出现了空指针或者数组下标越界异常:"+e.fillInStackTrace());
            /**
             * 可以定义多个catch来捕获不同的异常进行不同的处理
             * */
        }catch (Exception e){
            /**  Exception 是任意类型的异常，虽然有运行异常，但是可以防止应用程序被 JVM Kill掉  这个类型的捕获放在最后一个catch */
            System.out.println("发生了一个未知的错误 ："+e.fillInStackTrace());
        }
        System.out.println("程序结束了！");
    }
}
