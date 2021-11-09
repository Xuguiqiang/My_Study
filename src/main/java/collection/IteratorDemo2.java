package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Xgq
 * @date 2021/11/911:46
 * @Title IteratorDemo2
 * @Package API Collection Iterator
 * @Description
 */
public class IteratorDemo2 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        System.out.println(c);
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()){
            if (it.next() == 3){
                it.remove();
            }
        }
        System.out.print(it.next()+"\t");
    }
}
