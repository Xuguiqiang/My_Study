package thread;

/**
 * @author Xgq
 * @date 2021/11/510:13
 * @Title DeamonThreadDemo
 * @Package API Thread
 * @Description
 *
 *    守护线程
 *    也称为后台线程，守护线程是通过普通线程调用setDeamon(true)设置转换而来
 *    守护线程与普通线程在结束时机上有一点不同：进程结束时
 *
 *    当java方法中所有的普通线程都结束时，该进程就会结束，此时会kill所有还在运行的守护线程
 */
public class DeamonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++){
                    System.out.println("Rose: let me go !");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("Rose: bye!");
            }
        };
        Thread jack = new Thread(){
            public void run(){
                while (true){ /**  原本是无限循环，现在被设置了守护线程，在其它线程结束时，守护线程会被 kill    */
                    System.out.println("Jack: you jump i jump !");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        rose.start();
        /**
         *
         *     设置守护线程必须在线程启动之前进行
         *
         * */
        jack.setDaemon(true);  // 设置守护线程在线程启动之前 ，否则会抛出非法线程异常
        jack.start();
        /**
         *    主线程也是普通线程，如果主线程在这里进入了无限循环，导致了主线程一直活着，那么rose线程结束后主线程也没有结束，因此jack也不会被 kill
         * */
        while(true);
    }
}
