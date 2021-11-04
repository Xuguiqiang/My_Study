package any_test.socket1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Xgq
 * @date 2021/11/419:22
 * @Title Server
 * @Package API Socket
 * @Description socket server
 */
public class Server {
    private ServerSocket serverSocket;
    public Server() {
        try {
            System.out.println("正在启动服务端并打开端口...");
            serverSocket = new ServerSocket(12307);
            System.out.println("服务端已经启动完成 !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            while (true){
                System.out.println("等待客户端的连接...");
                Socket socket = serverSocket.accept();
                ClientThread clientThread = new ClientThread(socket);
                Thread t1 = new Thread(clientThread);
                t1.start();
                System.out.println("已开启一个线程!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
