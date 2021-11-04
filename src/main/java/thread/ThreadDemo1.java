package thread;

/**
 * @author Xgq
 * @date 2021/11/411:25
 * @Title ThreadDemo1
 * @Package API Thread
 * @Description 多线程
 *
 *    多线程用于并发执行多个任务
 *    多线程的创建有两种
 *    1。继承Thread并重写run()方法
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new Mythread1();
        Thread t2 = new Mythread2();
        /**
         *
         * 要注意，启动线程是对象要调用start()方法而不是run()方法
         * 当start()调用后，线程便纳入到线程调试器中统一管理，当第一次获取时间片时，线程的run方法会被自动调用
         *
         * */
        t1.start();
        t2.start();
    }
}

/**
 *
 *      第一种创建线程的方式优点是结构简单，适合使用匿名内部类形式创建。
 *      缺点：
 *          1。由于java是单继承的，这导致了如果继承了Thread就无法继承其它类了，实际开发中很不方便
 *          2。定义线程的同时重写了run方法将线程的任务定义在了线程中，导致线程与任务存在一个必然的耦合关系，不利于线程的重用
 *
 * */
class Mythread1 extends Thread{
    public void run(){
        for(int i = 0; i < 100; i ++){
            System.out.println("你是谁啊？");
        }
    }
}

class Mythread2 extends Thread{
    public void run(){
        for(int j = 0 ; j < 100; j ++){
            System.out.println("我是查水表的！");
        }
    }
}