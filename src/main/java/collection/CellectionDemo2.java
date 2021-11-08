package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Xgq
 * @date 2021/11/816:59
 * @Title CollectionDemo2
 * @Package API Collection
 * @Description 元素的equals方法对集合的很多操作产生影响
 */
public class CellectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        /**
         *    集合重写了toString方法，输出的格式如下:
         *    [元素1.toString(),元素2.toString(), ...,元素n.toString()]
         * */
        System.out.println(c);
        Point point = new Point(3,4);
        System.out.println(c.contains(point)); /**  contains 方法判断当前集合是否包含给定元素，包含则返回true 否则返回false 注意：自定类中要重写equals()方法   */
        c.remove(point); /**  删除与point相同的内容，只删除第一个找到的内容   */
        System.out.println(c);
    }
}
