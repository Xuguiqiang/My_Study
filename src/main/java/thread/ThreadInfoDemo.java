package thread;

/**
 * @author Xgq
 * @date 2021/11/416:50
 * @Title ThreadInfoDemo
 * @Package API Thread
 * @Description
 *
 *    获取线程相关信息的一组方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        /**  获取主线程相关信息   */
        Thread main = Thread.currentThread();
         /**  获取线程名字  */
         String name = main.getName();
         /**  获取线程的唯一标识  */
         long id = main.getId();
         /**  获取线程的优先级 */
         int priority = main.getPriority();
        System.out.println("线程名字："+name+"，ID："+id+"，优先级:"+priority);

        /**  查看显示是否还活着  */
        boolean isAlive = main.isAlive();
        /**  查看是否为守护进程  */
        boolean isDaemon = main.isDaemon();
        /**  查看线程是否被中断了  */
        boolean isInterrupted = main.isInterrupted();
        System.out.println("isAlive:"+isAlive+",isDaemon:"+isDaemon+",isInterrupted:"+isInterrupted);
    }
}
