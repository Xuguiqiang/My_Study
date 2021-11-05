package thread;

import java.util.Scanner;

/**
 * @author Xgq
 * @date 2021/11/417:29
 * @Title SleepDemo
 * @Package API Thread Method
 * @Description sleep
 *
 *      线程提供了一个静态方法
 *      static void sleep(long ms)
 *      可以使执行该方法的线程阻塞指定毫秒
 */
public class SleepDemo {
    public static void main(String[] args) {
//        System.out.println("程序开始了...");
//
//        try {
//            Thread.sleep(5000);  /**  线程阻塞5000毫秒   */
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("程序结束了！");
        Scanner scanner = new Scanner(System.in);
        for (int i = scanner.nextInt(); i > 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("倒计时结束！");
    }
}
