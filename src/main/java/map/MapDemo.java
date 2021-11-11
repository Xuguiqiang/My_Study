package map;

import javax.sound.midi.Soundbank;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Xgq
 * @date 2021/11/11
 * @Title MapDemo
 * @Description Map 查找表
 *
 *          java.util.Map
 *          Map 体现的样子是一个多行两列的表格，其中左列称为Key,右列称为Value
 *          Map 总是根据 Key 获取对应的 Value
 *          Map 要求 Key 不允许重复(Key 的 equals方法作为判定重复的依据
 *
 *          常用实现类: java.util.HashMap,散列表,当今查询速度最快的数据结构 .
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        /**
         *    将一组键值对存入Map,因为Map要求不允许有重复的key,因此若使用已有的key存放value那么就是替换value操作,此时方法返回值为被替换的value
         *    否则返回值为null
         * */
        map.put("语文",78);
        map.put("数学",75);
        map.put("英语",89);
        map.put("物理",98);
        map.put("化学",56);
        /**
         *     若 value 是包装类，那么接收时避免使用基本类型，否则返回值为null时自动拆箱会引发空指针异常
         *     下面代码会被编译器自动拆箱为： int r = map.put("生物",100).intValue();
         * */
        //int r = map.put("生物",100);  添加没有的 key 时，返回的是null , 自动拆箱会抛空指针异常
        System.out.println(map);
        int r = map.get("化学");
        System.out.println("化学成绩为:"+r);
//        r = map.get("体育");  //查询Map中没有的key时，返回null，自动拆箱也会抛出空指针异常
//        System.out.println("体育成绩为:"+r);
        r = map.remove("数学");
        System.out.println("被删除的数学成绩为："+r);
        System.out.println(map);
        Integer r1 = map.remove("语文");
        System.out.println(r1);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey("语文"));
        System.out.println(map.containsValue(98));
    }
}
