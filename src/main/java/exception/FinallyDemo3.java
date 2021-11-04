package exception;

/**
 * @author Xgq
 * @date 2021/11/310:20
 * @Title FinallyDemo3
 * @Package API Exception
 * @Description 异常的处理
 *
 *   分别 说明 final finally finalize
 *   final : 定义的类不能被继承，定义的方法不能重写，定义的变量值不能被改变
 *   finally: 异常中一定会执行的方法块
 *   finalize: 某个类被 gc kill 之前调用的方法，也就是一个类生命周期的最后一个方法，gc即将释放一个对象前会调用该对象的finalize方法，调用后会释放该对象。 注意：此方法中不应当有耗时操作，否则影响 gc 工作。
 */
public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(test("0")+","+test(null)+","+test(""));
    }

    public static int test(String str){
        try {
            return str.charAt(0)-'0';
        } catch (NullPointerException e) {
            return 1;
        }catch(Exception e){
            return 2;
        } finally {
            return 3;
        }
    }
}
