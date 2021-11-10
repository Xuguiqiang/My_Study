package collection;

import java.util.*;

/**
 * @author Xgq
 * @date 2021/11/911:46
 * @Title IteratorDemo2
 * @Package API Collection Iterator
 * @Description
 *
 *     Integer 集合转换为 数组
 */
public class IteratorDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i ++){
            list.add(i);
        }
        System.out.println(list);
        Integer[] ints = list.toArray(new Integer[0]);
        for (int i = 0; i < ints.length; i ++){
            System.out.println(ints[i]);
        }
    }
}
