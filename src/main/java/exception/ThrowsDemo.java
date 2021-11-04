package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Xgq
 * @date 2021/11/314:02
 * @Title ThrowsDemo
 * @Package API Exception
 * @Description
 *
 *    子类重写超类中含有throws声明异常抛出的方法时对于throws的重写规则
 */
public class ThrowsDemo {
    public void dosome() throws IOException, AWTException{}
}

class Subclass extends ThrowsDemo{

    /**  重写允许不再抛出任何异常或者允许只抛出部分异常，还允许超类方法抛出异常的子类异常  */
    //public void dosome() throws IOException,AWTException{}

    //public void dosome(){}

    //public void dosome() throws IOException{}

    //public void dosome() throws FileNotFoundException{};

    /**  不允许抛出额外异常（超类方法没有抛出的且没有继承关系的异常）  */
    //public void dosome() throws SQLException{};

    /**  不允许抛出超类方法抛出异常的超类异常  */
    //public void dosome() throws Exception{}
}