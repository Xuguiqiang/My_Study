package homework.day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Collection<Integer> list = new HashSet<Integer>();
		for (int i = 0; list.size()!=10; i ++){
			int rand = (int)(Math.random()*100);
			list.add(rand);
		}
		System.out.println(list+",size:"+list.size());
		Collection<Integer> list2 = new HashSet<Integer>(list);
		System.out.println(list2+",size:"+list2.size());
	}
}
