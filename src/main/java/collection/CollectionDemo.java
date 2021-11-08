package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author Xgq
 * @date 2021/11/816:01
 * @Title CollectionDemo
 * @Package API 集合
 * @Description 集合
 *
 *     java 集合框架
 *     java.util.Collection接口，是所有集合的顶级接口，里面规定了所有集合都需要具备的功能
 *     集合与数组一样可以保存一组元素，但是维护元素的相关操作都封装成了方法，使用便捷
 *     并且集合有多种实现类实现了不同的数据结构，实际开发中可选取更适合的结构来保存并操作元素
 *     常见子类型：
 *     java.util.Set:不可重复集
 *     java.util.List：可重复集且有序
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList(); // list允许重复
        //Collection c = new HashSet();     //set不允许重复内容
        /**
         *       boolean add(E e)
         *       向当前集合中添加一个元素，成功添加后返回true
         *       注意：集合只能存放引用类型元素，存放基本类型时会自动装箱为包装类
         * */
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        c.add("one");
        c.add("two");
        System.out.println(c);
        System.out.println("size:"+c.size());
        System.out.println("是否为空集："+c.isEmpty());
    }
}
