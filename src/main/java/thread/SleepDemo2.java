package thread;

/**
 * @author Xgq
 * @date 2021/11/59:23
 * @Title SleepDemo2
 * @Package API Thread
 * @Description Sleep 方法的异常
 *
 *   sleep 方法要求必须处理中断异常 ：InterruptedException
 *   当一个线程调用sleep方法处于睡眠阻塞的过程中，该线程的interrupt()方法被调用时会中断
 *   其睡觉阻塞，此时sleep方法会抛出该异常
 */
public class SleepDemo2 extends Thread {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("林：刚美完容~睡一会儿吧！");
                try {
                    Thread.sleep(500000);
                } catch (InterruptedException e) {
                    System.out.println("林：你喊个锤子，你大爷！");
                }
                System.out.println("林：醒了！");
            }
        };

        Thread huang = new Thread(){
            public void run(){
                System.out.println("黄：80 ， 40，开始砸 ...");
                for (int i = 0; i < 5; i++){
                    try {
                        Thread.sleep(1000);
                        System.out.println("哐 哐 哐 ....");
                    } catch (InterruptedException e) {
                        System.out.println("黄:砸墙被中断！会抛出异常！");
                    }
                }
                System.out.println("大哥，搞定！");
                lin.interrupt();
            }
        };

        lin.start();
        huang.start();
    }
}
