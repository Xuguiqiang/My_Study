package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Xgq
 * @date 2021/11/39:26
 * @Title FinallyDemo2
 * @Package API Exception
 * @Description 异常
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
             fos = new FileOutputStream("fos.dat",true);
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
