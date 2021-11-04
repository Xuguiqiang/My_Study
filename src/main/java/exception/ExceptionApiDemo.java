package exception;

/**
 * @author Xgq
 * @date 2021/11/314:35
 * @Title ExceptionApiDemo
 * @Package API Exception
 * @Description
 */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始运行！");
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            /**
             *        将当前的错误信息输出到控制台
             *        将错误信息与System.out.println()是并发的，因此控制台显示顺序可能不同
             *        但是程序执行的顺序一定是至上而下正确的
             * */
            e.printStackTrace();

            String message = e.getMessage();
            System.out.println(message);
        }

        System.out.println("程序运行结束！");
    }
}
