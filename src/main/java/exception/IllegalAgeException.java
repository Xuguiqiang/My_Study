package exception;

/**
 * @author Xgq
 * @date 2021/11/315:15
 * @Title IllegalAgeException
 * @Package API Exception
 * @Description 自定义异常
 *
 *    年龄不合法异常
 *
 *    自定义类异常，通常用来说明不符合业务逻辑导致的错误
 *    自定义异常满足以下几点：
 *    1。类名要做到见名知意
 *    2。需要继承自Exception(直接或间接继承)
 *    3。提供超类异常定义的所有构造器
 */
public class IllegalAgeException extends Exception {
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
