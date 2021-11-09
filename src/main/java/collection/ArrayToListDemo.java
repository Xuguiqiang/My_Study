package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Xgq
 * @date 2021/11/917:24
 * @Title ArrayToListDemo
 * @Package API Array to List
 * @Description 数组转集合
 *        数组转换为集合
 *        数组的工具类Arrays提供了一个静态方法的 asList，可以将一个数组转换为一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five","six","seven","eight","nine","ten"};
        System.out.println(Arrays.toString(array));
        List<String> list = Arrays.asList(array);
        System.out.println(list);
        list.set(1,"EDG"); /**   集合中对元素的设置原数组中的数据也会发生改变   */
        /**
         *      list.add("abc");
         *      数组的长度是不可变的，数组转换为集合，集合内元素的操作原数组也会发生变化
         *      因此由数组转换为集合类型的 进行增删元素会抛出：UnsupportedOperationException （不支持的操作）异常
         * */
        System.out.println(Arrays.toString(array));

        /**   可自行创建一个集合，这样操作是没有限制的
         *    所有集合都提供了一个参数为Collection的构造器，作用是创建该集合的同时包含给定集合中的所有元素
         * */

        List<String> list1 = new ArrayList<>(list); /**  创建一个集合，并且给该集合所有元素赋值， 相当于复制了 list  */
        System.out.println("list1:"+list1);
        list1.add("RNG");
        System.out.println("list1:"+list1);
    }
}
