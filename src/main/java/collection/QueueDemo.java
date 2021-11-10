package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Xgq
 * @date 2021/11/1014:41
 * @Title QueueDemo
 * @Package API Collection
 * @Description Queue接口，队列
 *
 *      java.util.Queue 接口，队列
 *      Queue 继承自Collection
 *      队列是精典的数据结构，可以保存一组元素，但是存取元素必须遵循先进先出原则
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        /**  入队操作，将元素添加到队列末尾  */
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        System.out.println(queue);
        /**  出队操作 拿出队列当中第一个元素，然后删除队列中第一个元素  */
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);
        /**  引用队首元素，获取后不对其删除  */
        String str1 = queue.peek();
        System.out.println(str1);
        System.out.println(queue);
        /**  遍历
         *   使用迭代器（新循环遍历），元素不受影响，还存在于队列中
         * */
        for (String s : queue){
            System.out.println(s);
        }
        System.out.println(queue);
        System.out.println(queue.size());
        while (queue.size() > 0){
            System.out.println(queue.poll());
        }
        System.out.println(queue);
    }
}
