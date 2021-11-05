package thread;

/**
 * @author Xgq
 * @date 2021/11/417:08
 * @Title PriorityDemo
 * @Package API Thread Method
 * @Description
 *
 *    线程的优先级
 *    线程有10个优先级，分别对应整数1-10，其中1为最低，10为最高，5为默认值
 *    线程start()方法调用后便纳入线程调度器中并发运行，线程只能被动分配时间片进行并发
 *    而调度器会尽可能的均匀分配时间片
 *    通过调整线程的优先级可以最大程度的改善获取时间片的概率，优先级越高的线程获取时间片的次数越多
 *
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread max = new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++){
                    System.out.println("max");
                }
            }
        };

        Thread mid = new Thread(){
            public void run(){
                for (int j = 0;j < 100; j++){
                    System.out.println("mid");
                }
            }
        };

        Thread min = new Thread(){
            public void run(){
                for (int k = 0; k < 100; k++){
                    System.out.println("min");
                }
            }
        };

        max.setPriority(10);
        mid.setPriority(5);
        min.setPriority(10);
        max.start();
        mid.start();
        min.start();
    }
}
