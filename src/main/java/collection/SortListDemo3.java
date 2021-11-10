package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Xgq
 * @date 2021/11/1014:01
 * @Title SortListDemo3
 * @Package API Collection
 * @Description 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("一");
        list.add("一二");
        list.add("三二一");
        list.add("一二四");
        list.add("五");
        list.add("一二三四五六");
        list.add("1357980");
        list.add("406221496");
        list.add("1");
        System.out.println(list);
        Collections.sort(list,(str1,str2) -> str1.length()-str2.length() );
        //Collections.sort(list, Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
