package integer;

/**
 * @author Xgq
 * @date 2021/10/2910:38
 * @Title IntegerDemo2
 * @Package API Integer
 * @Description
 *
 * JDK5之后引入了一个新的特性： 自动拆装箱
 * 编译器在遇到包装类型与基本类型赋值的情况下，会自动的补全代码完成他们的转换
 * 注意： 只是编译器认可，字节码文件是没有直接赋值的情况的（编译器认可，虚拟机不认可，编译器自动补全）
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        /**
         *以下代码中，编译器会自动做如下的补全
         * int i = 123;
         * Integer in = Integer.valueof(i);
         * int num = in.intValue();
         *
         *  */
        int i = 123;
        Integer in = i;
        int num = in;
    }
}
