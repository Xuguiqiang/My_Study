package thread;

import java.sql.SQLOutput;

/**
 * @author Xgq
 * @date 2021/11/511:17
 * @Title JoinDemo
 * @Package API Thread
 * @Description
 *
 *     协调线程的同步运行可以使用线程的join方法
 *     该方法允许一个线程在另一个线程上等待，直到该线程结束后才会结束等待继续后续工作
 *
 *     同步运行： 多个线程执行存在先后顺序
 */
public class JoinDemo {
    /**  标识图片是否下载完毕  */
    private static boolean isFinish = false;
    public static void main(String[] args) {
        Thread download = new Thread(){
            public void run(){
                System.out.println("download:图片开始下载....");
                for (int i = 1 ; i <= 100 ; i++){
                    System.out.println("down:"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("down:图片下载完成！");
                isFinish = true;
            }
        };
        Thread show = new Thread(){
            public void run(){
                System.out.println("开始显示商品列表！");
                System.out.println("开始显示商品文字！");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
                System.out.println("列表文字显示完毕！");
                System.out.println("开始显示图片！");
                try {
                    /**  在此等待download线程执行完毕
                     *   show线程在这里会进入到阻塞状态，直到download结束才会结束阻塞
                     * */
                    download.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!isFinish){
                        throw new RuntimeException("图片加载没有成功！");
                }
                System.out.println("图片显示完成！");
            }
        };

        download.start();
        show.start();
    }
}
