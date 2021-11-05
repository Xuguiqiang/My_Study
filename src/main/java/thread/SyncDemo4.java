package thread;

/**
 * @author Xgq
 * @date 2021/11/517:21
 * @Title SyncDemo4
 * @Package API Thread
 * @Description
 *
 *     互斥锁
 *     当使用多个synchronized 锁定多个代码片段，并且指定的锁对象相同时，那么这些代码片段就是互斥的
 *     即：多个线程不能同时执行它们
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Boo b = new Boo();
        Thread t1 = new Thread("张三"){
            public void run(){
                b.methodA();
            }
        };
        Thread t2 = new Thread("李四"){
            public void run(){
                b.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo{
    public void methodA(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":正在执行A方法....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+":执行A方法完毕!");
    }

    public synchronized void methodB(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":正在执行B方法!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+":执行B方法完毕!");
    }
}
