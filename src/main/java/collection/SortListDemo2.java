package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Xgq
 * @date 2021/11/1010:17
 * @Title SortListDemo2
 * @Package API Collection Sort2
 * @Description
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(1,2));
        list.add(new Point(3,4));
        list.add(new Point(43,2));
        list.add(new Point(23,96));
        list.add(new Point(11,22));
        list.add(new Point(75,63));
        System.out.println(list);
        /**
         *        compare 比较
         *        Comparable 可比较的
         *
         *        sort 方法在进行排序时要求集合元素必须实现Comparable接口，否则编译不通过
         *
         *        上述做法对我们的代码有侵入性，尽量避免。
         *        侵入性：当我们使用某个API的方法时，该方法要求我们为其修改其他额外的代码，这个现象就是侵入性，它不利于程序的后期维护
         *
         *        比较器接口
         *        该接口要求实现方法：compare
         *        目的：为参数o1,o2定义比较大小的规则
         *        返回值要求：
         *              当返回值>0时，表示 o1 > o2
         *              当返回值<0时，表示 o1 < o2
         *              当返回值=0时，表示 o1 = o2
         * */
//        Comparator c = new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
//                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
//                return len1-len2;
//            }
//        };
        /**
         *           java 23种设计模式之一：回调模式
         *           我们调A类的B方法时，传入一个参数C（C中有一个方法D），而B方法在执行的过程中会
         *           回调我们传入的C类中的D方法，这种现象称为回调模式。
         *           常见的回调场景：
         *           文件过滤器: file.listFiles(FileFilter filter)
         *           集合排序:   Collections.sort(List list, Comparator c)
         *           还有潜艇游戏中为键盘，鼠标等添加监听器都是常见的回调模式。
         *           回调模式常被用在异步调用中使用，是常用的设计模式之一。
         *
         *           没有侵入性的写法，排序调用时，使用匿名内部类
         *
         * */
        Collections.sort(list,(o1,o2) -> o1.getX()*o1.getX()+o1.getY()*o1.getY()-o2.getX()*o2.getX()-o2.getY()*o2.getY());
        System.out.println(list);
    }
}
