package thread;

/**
 * @author Xgq
 * @date 2021/11/515:38
 * @Title SyncDemo2
 * @Package API Thread
 * @Description
 *
 *          Synchronized 同步块
 *
 *          有效的缩小同步范围可以在保证并发安全的前提下尽可能的提高并发效率
 *
 *          语法： synchronized(同步监视器对象){   需要多线程同步执行的代码片断  }
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread("张三"){
          public void run(){
              shop.buy();
          }
        };
        Thread t2 = new Thread("小红"){
            public void run(){
                shop.buy();
            }
        };

        t1.start();
        t2.start();
    }
}
 class Shop{
    /**   public void synchronized buy()   多个线程将排队执行整个方法
     *    在成员方法上使用synchronized ，那么同步监视器对象就是该方法所属对象，即:this
     * */
    public void buy(){
        Thread t = Thread.currentThread();
        try {
            System.out.println(t.getName()+":正在挑衣服...");
            Thread.sleep(3000);
            /**
             *      同步块可以更灵活更准确的锁定需要排除的代码片断
             *      使用同步块需要指定同步监视器对象，它可以是java中任何引用类型的实例
             *      只要保证多个需要排除执行该代码块的线程看到的这个对象是同一对象即可
             *
             *      synchronized(new Object())是没有效果的，这里是要求多个线程指向的是同一对象，对会依次排除进入执行
             * */
            synchronized (this){
                System.out.println(t.getName()+":正在试衣服...");
                Thread.sleep(3000);
            }
            System.out.println(t.getName()+":结账离开!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 }
