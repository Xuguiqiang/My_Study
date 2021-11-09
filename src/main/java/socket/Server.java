package socket;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Xgq
 * @date 2021/11/315:58
 * @Title Server
 * @Package Socket
 * @Description
 *
 *     聊天室服务端
 *
 *     java.net.ServerSocket
 *     运行在服务端的ServerSocket主要有两个作用：
 *     1。向系统申请固定的服务端口，客户端Socket就是通过这个端口进行连接的
 *     2。监听服务端口，一旦一个客户端连接就会立即返回一个Socket，通过它与客户端进行双向交互
 */
public class Server {
    private ServerSocket serverSocket;
    //private PrintWriter[] allOut = { };
    private Collection<PrintWriter> allOut = new ArrayList();

    public Server() {
        try {
            /**
             *     实例化ServerSocket要指定指定服务端口，该端口不能与系统其它应用占用端口相同，否则会抛出异常
             *     java.net.BindException: address already in use　若有该异常换端口，直到没有异常
             * */
            //System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(12306);
            //System.out.println("服务端已开启!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        while (true) {
            //System.out.println("等待客户端连接....");
            /**
             *     ServerSocket 提供的方法
             *     Socket accept()
             *     该方法是一个阻塞方法，调用后开始等待客户端的连接，一旦一个客户端连接那么该方法会立即返回一个Socket
             * */

            try {
                Socket socket = serverSocket.accept();
                //System.out.println("有客户端已经连接！");
                /**  启动一个线程来与客户端进行交互  */
                ClientHandler handler = new ClientHandler(socket);
                Thread t1 = new Thread(handler);
                t1.start();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    private class ClientHandler implements Runnable {
        /**
         * 该线程任务用于与所有的客户端进行交互
         */
        private Socket socket;
        private String host; //客户端的地址信息

        public ClientHandler(Socket socket) {
            this.socket = socket;
            this.host = socket.getInetAddress().getHostAddress();
        }

        @Override
        public void run() {
            PrintWriter pw = null;
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8")), true);
                synchronized (Server.this) {
                    //allOut = Arrays.copyOf(allOut,allOut.length+1);
                    //allOut[allOut.length-1] = pw;
                    allOut.add(pw);
                }
                sendMessage(host + "上线了," + "当前在线人数：" + allOut.size());
                String message;
                /**
                 *
                 * 服务端通过缓冲流读取客户端发送过来一行字符串的操作时，这个方法会产生阻塞，等待对方发送消息，直到对方发送过来一行字符串则该方法返回此行内容
                 * 当客户端调用socket.close()断开连接，那么这里readLine方法会返回null ,表示读取到了末尾（对方断了连接）。
                 * 如果客户端意外中断（强行关闭，停电，断网等）那么服务端这边的readline方法会抛出异常
                 *
                 * */
                while ((message = br.readLine()) != null) {
                    /**  遍历allOut，将消息回复给所有客户端  */
                    sendMessage(host + "说：" + message);
                }
            } catch (IOException e) {
                //e.printStackTrace();
            } finally {
                //处理客户端断开连接后的操作
                /**       synchronized (Server.this)    如果有集合的使用而不是数组，那么线程锁的对象可以直接设置为锁定集合
                 *        因为数组是需要扩容的，数组扩容是创建新的数组，原数组是会被 gc kill 的，而集合没有扩容的说法，是直接 add 的，因此对象是不会改变
                 *        这里不管有多少线程，都是在操作一个集合，为防止出现抢的现象，因此每当一个线程进入执行需要锁定集合达到并发的安全
                 * */
                synchronized (allOut) {
                    /*for (int i = 0; i < allOut.length; i ++){
                        if (allOut[i] == pw){
                            allOut[i] = allOut[allOut.length-1];
                            allOut = Arrays.copyOf(allOut,allOut.length-1);
                            break;
                        }*/
                    /*Iterator<PrintWriter> it = allOut.iterator();
                    while (it.hasNext()){
                        if (it.next().equals(pw)){
                            it.remove();
                        }
                    }*/
                    allOut.remove(pw);
                }
                sendMessage(host + "下线了," + "当前在线人数：" + allOut.size());
                try {
                    socket.close(); /**  与客户端断开连接释放资源  */
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * 将给定的消息，转发给所有的客户端
         */
        private void sendMessage(String message) {
            synchronized (allOut) {
                /*for (int i = 0; i < allOut.length; i ++){
                    allOut[i].println(message);
                }*/
                for (PrintWriter printWriter : allOut) {
                    printWriter.println(message);
                }
            }
        }
    }
}
