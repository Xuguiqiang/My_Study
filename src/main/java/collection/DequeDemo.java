package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Xgq
 * @date 2021/11/1015:46
 * @Title DequeDemo
 * @Package API Collection
 * @Description 双端队列
 *
 *      java.util.Deque 接口
 *      Deque类继承自Queue,双端队列的特点是队列两端都可以做出入队操作
 *      常用实现类: java.util.LinkedList
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        deque.offer("four");
        deque.offerFirst("start");
        deque.offerLast("end");
        System.out.println(deque);
        deque.poll(); //获取并删除 "start"
        deque.pollFirst(); // 获取并删除 "one"
        deque.pollLast(); //获取并删除 "end"
        System.out.println(deque);
    }
}
