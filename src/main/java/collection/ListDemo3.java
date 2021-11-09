package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xgq
 * @date 2021/11/916:35
 * @Title ListDemo3
 * @Package API Collection List
 * @Description
 *
 *      取子集
 *      list subList(int start,int end)
 *      可以获取当前List中指定范围内的子集，两个参数为开始与结束的下标（含头不含尾）
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            list.add(i);
        }
        System.out.println(list);
        /**  获取子集  */
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);

        /**  将子集每个元素扩大40倍  */
        for (int i = 0; i < subList.size(); i ++){
            subList.set(i,subList.get(i)*10);
        }
        System.out.println(subList);
        /**
         *      对子集的操作就是对原集合对应元素的操作
         * */
        System.out.println(list);

        /**  将list集合中下标 2-8删除,     对子集的操作就是对原集合对应元素的操作  */
        list.subList(2,9).clear();
        System.out.println(list);
    }
}
