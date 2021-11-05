package thread;

/**
 * @author Xgq
 * @date 2021/11/519:19
 * @Title DeadLockDemo
 * @Package API Thread
 * @Description 死锁
 */
public class DeadLockDemo {
    private static Object chopstick = new Object(); //筷子
    private static Object spoon = new Object();//勺
    public static void main(String[] args) {
        Thread np = new Thread(){//北方人
            public void run(){
                try {
                    System.out.println("北方人开始吃饭...");
                    System.out.println("北方人去拿筷子...");
                    synchronized (chopstick) {
                        System.out.println("北方人拿起了筷子开始吃饭...");
                        Thread.sleep(5000);
                        System.out.println("北方人吃完了饭，去拿勺...");
                        synchronized (spoon){
                            System.out.println("北方人拿起了勺开始喝汤...");
                            Thread.sleep(5000);
                            System.out.println("北方人喝完了汤");
                        }
                        System.out.println("北方人放下了勺");
                    }
                    System.out.println("北方人放下了筷子");
                    System.out.println("北方人吃饭完毕!");
                }catch(Exception e){
                }
            }
        };

        Thread sp = new Thread(){//南方人
            public void run(){
                try {
                    System.out.println("南方人开始吃饭...");
                    System.out.println("南方人去拿勺...");
                    synchronized (spoon) {
                        System.out.println("南方人拿起了勺开始喝汤...");
                        Thread.sleep(5000);
                        System.out.println("南方人喝完了汤，去拿筷子...");
                        synchronized (chopstick){
                            System.out.println("南方人拿起了筷子开始吃饭...");
                            Thread.sleep(5000);
                            System.out.println("南方人吃完了饭");
                        }
                        System.out.println("南方人放下了筷子");
                    }
                    System.out.println("南方人放下了勺");
                    System.out.println("南方人吃饭完毕!");
                }catch(Exception e){
                }
            }
        };

        np.start();
        sp.start();
    }
}
