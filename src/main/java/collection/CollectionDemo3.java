package collection;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Xgq
 * @date 2021/11/817:27
 * @Title CollectionDemo3
 * @Package API Collection
 * @Description 集合只能存放引用类型元素，并且保存的也是元素的引用（地址）
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        Collection c = new ArrayList();
        c.add(point);
        System.out.println(point);
        System.out.println(c);
        point.setX(3);
        System.out.println(point);
        System.out.println(c);
    }
}
