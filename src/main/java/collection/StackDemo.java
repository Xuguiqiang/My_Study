package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Xgq
 * @date 2021/11/1016:26
 * @Title StackDemo
 * @Package API Stack
 * @Description 栈结构
 *
 *         栈可以保存一组元素，但是存取元素必须遵循先进后出原则
 *         栈可以通过使用双端队列从同一侧做出入队来完成，因此双端队列也为栈提供了其经典的
 *         两个方法：push(入栈)，pop(出栈)
 *
 *         实际开发中我们经常使用栈来完成"后退","前进" 这样的功能
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        for (String s : stack){
            System.out.println(s);
        }
        System.out.println(stack.size());
        while (stack.size() > 0){
            System.out.print(stack.pop()+"\t");
        }
        System.out.println();
        System.out.println(stack);
    }
}
