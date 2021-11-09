package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xgq
 * @date 2021/11/916:24
 * @Title ListDemo2
 * @Package API Collection List
 * @Description
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        /**
         *     void add(int index, element);
         *     在下标为index处插入element
         * */
        list.add(2,"six");
        System.out.println(list);
        /**
         *
         *      void remove(index);
         *      删除下标为index的元素
         * */
        String old = list.remove(3);
        System.out.println(list);
        System.out.println("被删除的元素是："+old);
    }
}
