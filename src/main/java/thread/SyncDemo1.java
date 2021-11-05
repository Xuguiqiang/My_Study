package thread;

/**
 * @author Xgq
 * @date 2021/11/514:21
 * @Title SyncDemo1
 * @Package API Thread
 * @Description 多线程并发安全问题
 *
 *     当多个线程并发操作同一临界资源，由于线程切换时机不确定，导致操作顺序出现混乱
 *     临界资源：操作资源的完整步骤同一时刻只能有单一线程进行的资源
 */
public class SyncDemo1 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
          public void run(){
              while (true){
                  int bean = table.getBeans();
                  Thread.yield();
                  System.out.println(getName()+":"+bean);
              }
          }
        };

        Thread t2 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}


class Table{
    private int beans = 20; //桌子上有20个豆子
    /**
     *
     *      在一个方法上使用 synchronized 修饰后，该方法称为同步方法，即：多个线程不能同时在方法内执行。将多个线程并发 ”抢“ 着操作改为同步
     *      “排除” 操作可有效解决多线程并发安全问题
     *
     * */
    public synchronized int getBeans(){
        if (beans == 0){
            throw new RuntimeException("没有豆子了！");
        }
        Thread.yield();
        return beans --;
    }
}
