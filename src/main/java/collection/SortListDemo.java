package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Xgq
 * @date 2021/11/1010:04
 * @Title SortListDemo
 * @Package API Collection SortList
 * @Description 集合元素的排序
 *
 *         集合工具类：java.util.Collections
 *         其提供了一个静态方法sort可以对List集合进行自然排序（从小到大）
 */
public class SortListDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        //Collections.sort(list);
        /**   按从大到小排列  */
        Collections.sort(list,(i1,i2) -> i2-i1 );
        System.out.println(list);
    }
}
