package socket;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

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
    public Server() {
        try {
            /**
             *     实例化ServerSocket要指定指定服务端口，该端口不能与系统其它应用占用端口相同，否则会抛出异常
             *     java.net.BindException: address already in use　若有该异常换端口，直到没有异常
             * */
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(12306);
            System.out.println("服务端已开启!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        while (true){
        System.out.println("等待客户端连接....");
        /**
         *     ServerSocket 提供的方法
         *     Socket accept()
         *     该方法是一个阻塞方法，调用后开始等待客户端的连接，一旦一个客户端连接那么该方法会立即返回一个Socket
         * */

        try{
            Socket socket = serverSocket.accept();
            System.out.println("有客户端已经连接！");
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

    private class ClientHandler implements Runnable{
        /**  该线程任务用于与指定的客户端进行交互  */
        private Socket socket;
        private String host; //客户端的地址信息
        public ClientHandler(Socket socket){
            this.socket = socket;
            this.host = socket.getInetAddress().getHostAddress();
        }
        @Override
        public void run() {
            try(
                    InputStream is = socket.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
                    PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8")),true);
                    ){
                String message;
                /**
                 *
                 * 服务端通过缓冲流读取客户端发送过来一行字符串的操作时，这个方法会产生阻塞，等待对方发送消息，直到对方发送过来一行字符串则该方法返回此行内容
                 * 当客户端调用socket.close()断开连接，那么这里readLine方法会返回null ,表示读取到了末尾（对方断了连接）。
                 * 如果客户端意外中断（强行关闭，停电，断网等）那么服务端这边的readline方法会抛出异常
                 *
                 * */
                while ((message = br.readLine()) != null){
                    pw.println(host+"说："+message);
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
