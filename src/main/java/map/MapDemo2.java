package map;

import java.util.*;

/**
 * @author Xgq
 * @date 2021/11/11
 * @Title MapDemo2
 * @Description Map的遍历
 *
 *     Map提供了三种遍历方式:
 *                          1.遍历所有的 Key
 *                          2.遍历每一组键值对
 *                          3.遍历所有的 Value (相对不常用)
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",65);
        map.put("数学",86);
        map.put("英语",92);
        map.put("物理",78);
        map.put("化学",62);
        map.put("生物",87);
        map.put("思想品德",43);
        map.put("数字电路",75);
        map.put("模拟电路",59);
        map.put("高等数学",82);
        map.put("FPGA",60);
        map.put("政治",70);
        System.out.println(map);
        /**  遍历所有的 Key Set keySet() 将当前 Map 中所有的 Key 以一个 Set 集合形式返回  */
        Set<String> set = map.keySet();
        for (String key : set){
            System.out.print(key+"\t");
        }
        /**  Set Entry() 将当前Map中每一组键值对以一个Entry实例表示并存入一个Set集合后返回  */
        System.out.println();
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for (Map.Entry e : entry){
            System.out.println(e.getKey()+"="+e.getValue());
        }
        /**  Collection values() 将当前Map中所有的value以一个集合形式返回  */
        Collection<Integer> c = map.values();
        for (Integer integer : c){
            System.out.print(integer+"\t");
        }
        /**  JDK8 之后遍历集合 Map 时可以使用 forEach 方法利用 lambda表达式进行遍历  */
        map.forEach(  (k,v)-> System.out.println(k+"="+v)  );

        /**  集合的 forEach遍历  */
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        System.out.println(collection);
        collection.forEach(  e -> System.out.print(e+"\t")  );
    }
}
