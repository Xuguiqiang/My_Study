package homework.day10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 改错题
 * 
 * 程序需求:向一个List集合中添加10个数字1-10，并将它们
 * 遍历出来并输出到控制台。
 *
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1 ; i <= 10; i ++){
			list.add(i);
		}
		//System.out.println(list);
		for(Integer integer: list){
			System.out.println(integer);
		}
		Iterator it = list.iterator();
		while (it.hasNext()){
			System.out.print(it.next()+"\t");
		}








//		List<int> list = new List<int>();       //改为：List<Integer> list = new ArrayList<Integer>();
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			int i = it.next();
//			System.out.println(it.next());      //改为：System.out.println(i);
//		}
	}
}





