package thread;

/**
 * @author Xgq
 * @date 2021/11/414:15
 * @Title ThreadDemo3
 * @Package API Thread
 * @Description 线程，匿名内部类
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        /**  继承Thread重写run方法   */
        Thread t1 = new Thread(){
            public void run(){
                for (int j = 0; j < 1000; j ++){
                    System.out.println("Thread");
                }
            }
        };

        /**  实现Runnable接口重写run方法单独定义任务   */
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++){
                    System.out.println("Runnable");
                }
            }
        };

        Thread t2 = new Thread(r1);
        t2.start();
        t1.start();
    }
}
