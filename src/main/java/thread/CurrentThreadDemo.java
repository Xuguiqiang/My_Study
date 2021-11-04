package thread;

/**
 * @author Xgq
 * @date 2021/11/414:31
 * @Title CurrentThreadDemo
 * @Package API Thread
 * @Description
 *
 *     java中所有代码都是靠线程执行的，main方法也不例外。JVM启动后会创建一条线程来执行main方法，这条线程被取名为main,俗称  “主线程”
 *     我们自己创建的线程也可以取名字，但通常使用默认值，格式为：Thread-X(X是一个数字)，由系统分配
 *
 *     Thread提供了一个静态方法：
 *     static Thread currentThread();
 *     该方法可以获取运行这个方法的线程
 *
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        /**  currentThread方法可以获取线程名称  */
        Thread main = Thread.currentThread();
        System.out.println("线程:"+main);
        dosome();
        System.out.println("min方法执行完毕!");

    }
    static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("dosome被执行的线程是："+t);
    }
}
