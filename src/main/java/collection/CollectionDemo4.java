package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author Xgq
 * @date 2021/11/99:08
 * @Title CollectionDemo4
 * @Package API Collection
 * @Description 集合的示例
 */
public class CollectionDemo4 extends Object {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add("vfp");
        Collection c2 = new HashSet();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c1"+c1);
        c2.addAll(c1);
        System.out.println("c2"+c2);
        Collection c3 = new ArrayList();
        c3.add("java");
        c3.add("c++");
        c3.add("vfp");
        //c3.add("php");
        System.out.println("c3全包含c1:"+c1.containsAll(c3));
        /**   这个是将c3当成一个元素看，判断c1里是否有一个元素是c3    */
        System.out.println("c3全包含c2:"+c3.contains(c1));
        System.out.println(c2);
        /**  删除c2集合中 c3里包含的元素  */
        c2.removeAll(c3);
        System.out.println(c2);
    }
}
