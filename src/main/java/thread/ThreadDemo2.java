package thread;

/**
 * @author Xgq
 * @date 2021/11/414:02
 * @Title ThreadDemo2
 * @Package API Thread
 * @Description 多线程
 *
 *    第二种创建线程的方式：实现Runnable接口单独定义线程的任务
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyRunnable1 m1 = new MyRunnable1();
        MyRunnable2 m2 = new MyRunnable2();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}

class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int j = 0;j < 1000;j ++){
            System.out.println("11");
        }
    }
}

class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i < 1000; i ++){
            System.out.println("22");
        }
    }
}
