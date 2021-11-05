package thread;

/**
 * @author Xgq
 * @date 2021/11/516:52
 * @Title SyncDemo3
 * @Package API Thread Method
 * @Description 静态方法中使用Synchronized
 *
 *     在静态方法上使用synchronized修饰，则该方法一定具有同步效果
 *     静态方法上指定后使用的同步监视器对象不是this,而是当前类的类对象(Class 的实例)
 *
 *     注：JVM中每个被加载的类都有且只有一个class实例与之对应
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread("张三"){
            public void run(){
                Aoo.dosome();
            }
        };
        /**   dosome方法是静态的，在方法区只会生成一次    */
        Thread t2 = new Thread("李四"){
            public void run(){
                Aoo.dosome();
            }
        };

        t1.start();
        t2.start();
    }
}

class Aoo{
    public static synchronized void dosome(){
        /**
         *     若要在静态方法中锁定一段代码
         *     synchronized 指定同步监视器对象时通常使用当前类的类对象
         *     即：类名.class
         *     synchronized(Aoo.class)
         *
         * */
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":正在执行dosome方法...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+":执行dosome方法完毕!");
    }
}