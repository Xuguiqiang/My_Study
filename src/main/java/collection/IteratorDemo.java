package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Xgq
 * @date 2021/11/99:41
 * @Title IteratorDemo
 * @Package API Collection
 * @Description
 *
 *      集合提供了统一的遍历方式： 迭代器模式
 *      Iterator iterator()
 *      该方法可以获取一个用来遍历当前集合的迭代器，使用它对集合进行遍历
 *
 *      java.util.Iterator 接口，迭代器接口，定义了遍历集合所需要的相关操作定义
 *      注：不同的集合都提供了一个用于遍历自身元素的迭代器实现类，我们无需记住他们分别叫什么，以多态的角度当它们是Iterator即可
 *
 *      迭代器遍历元素遵循的步骤为：问，取，删，其中删除不是必要的操作。
 */
public class IteratorDemo {
    public static void main(String[] args) {
        //Collection c = new ArrayList();
        Collection<String> c = new HashSet();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        c.add("#");
        c.add("six");
        System.out.println(c);
        /**  创建迭代器  */
        Iterator it = c.iterator();
        /**
         *     boolean hasNext()
         *
         * */
        while (it.hasNext()){
            String obj = (String) it.next();
            /**
             *        if ("#".equals(obj)){
             *                 c.remove(obj);
             *             }
             *        迭代器在遍历过程中要求不能通过集合的方法增删元素，否则会抛出异常
             * */
            if ("#".equals(obj)){
                /**   迭代器提供的remove是删除迭代器当前位置的元素   */
                it.remove();
            }
        }
        System.out.println(c);
    }
}
