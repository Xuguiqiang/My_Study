package any_test;

import java.util.Arrays;

/**
 * @author Xgq
 * @date 2021/11/814:06
 * @Title Demo
 * @Package
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        int[] allOut = {1,5,7,3,43,25,254,356,98,465};
        int pw = 356;
        System.out.println(Arrays.toString(allOut));

        /** 删除356*/
        for (int i = 0; i < allOut.length; i ++){
            if (allOut[i] == pw){
                allOut[i] = allOut[allOut.length-1];
                allOut = Arrays.copyOf(allOut,allOut.length-1);
                break;
            }
        }
        System.out.println(Arrays.toString(allOut));
    }
}
