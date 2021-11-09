package collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Xgq
 * @date 2021/11/910:50
 * @Title NewForDemo
 * @Package API Cellection NewFor
 * @Description
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for (int i = 0; i < array.length;i ++){
            System.out.println(array[i]);
        }
        for (String str:array){
            System.out.print(str+"\t");
        }
        System.out.println();
        /**  Collection<E> 集合定义时指定了一个泛型，这里使用时指定E为 String  */
        Collection<String> c = new HashSet<>();
        /**  add(E e) add方法的参数就是集合指定使用的泛型 */
        c.add("一");/**  指定泛型后，编译器会检查实参是否符合泛型的要求  */
        c.add("二");
        c.add("三");
        c.add("四");
        c.add("五");
        //c.add(123);  /**  Collection <String> 指定的 String 类型不匹配，编译错误  */
        /**     当明确了指定泛型为String 时，这里的新循环不用再进行强制转换
         *      for(Object obj : c) 不用再像此造型
         *      编译器会自己补充造型代码
         * */
        for (String str:c){
            System.out.print(str+"\t");
        }
    }
}
