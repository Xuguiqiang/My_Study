package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Xgq
 * @date 2021/11/917:07
 * @Title CollectionToArrayDemo
 * @Package API Collection
 * @Description 将当前集合转换为一个数组
 *
 *         Collection 提供了一个方法toArray,可以将当前集合转换为一个数组
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        /**
         *         将集合通过 toArray 方法转换为数组
         *         该方法要求必须要给 toArray传递一个数组对象，数组对象的长度可以随便定义，超过集合的size 的元素赋值为null, 否则返回的都是集合size大小长度的数组
         * */
        String[] string = c.toArray(new String[0]);
        System.out.println(Arrays.toString(string));
    }
}
