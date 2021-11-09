package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Xgq
 * @date 2021/11/914:31
 * @Title ListDemo1
 * @Package API Collection ArryList
 * @Description 可重复元素的集合
 *
 *      java.util.List 接口
 *      List继承自Collection,特点是可以存放重复元素且有序
 *      其提供了一套可以通过下标操作元素的方法
 *
 *      常用实现类:
 *      java.util.ArrayList: 内部使用数组实现，查询性能更好
 *      java.util.LinkedList: 内部使用链表实现，增删性能更好，首尾增删性能最佳
 *      在对性能没有特别苛刻要求下，是默认首选使用ArrayList即可
 *
 */
public class ListDemo1 {
    public void start(){};
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        String str = list.get(3);
        System.out.println(str);
        for (int i = 0;i < list.size(); i ++){
            str = list.get(i);
            System.out.print(str+"\t");
        }
        System.out.println();
        str = list.set(2,"six");
        System.out.println(list);
        System.out.println(str);

        /**   反转
         *      for(int i = 0; i < list.size()/2; i ++){
         *          String s = list.get(i);
         *          s = list.set(list.size()-1-i,s);  //返回原倒数位置的元素
         *          list.set(i,s);
         *      }
         * */
        for (int i = 0,j = list.size()-1; i < list.size()/2;i ++,j--){
            list.set(j,list.set(i,list.get(j)));
        }
        /**
         *      Collections.reverse(list);   //实现返回的API 方法
         * */
        System.out.println(list);
    }
}
