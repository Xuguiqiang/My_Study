package any_test.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Xgq
 * @date 2021/11/420:10
 * @Title Server
 * @Package
 * @Description
 */
public class Server {
    private ServerSocket serverSocket;
    public Server() {
        try {
            serverSocket = new ServerSocket(12306);
            System.out.println("服务端已经运行开启运行...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            while (true){
                Socket socket = serverSocket.accept();
                ClientThread clientThread = new ClientThread(socket);
                Thread t = new Thread(clientThread);
                t.start();
                System.out.println("创建新线程完毕,将继续等待连接...");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    private class ClientThread implements Runnable{
        private Socket socket;
        private String host;
        public ClientThread(Socket socket) {
            this.socket = socket;
            this.host = socket.getInetAddress().getHostAddress();
        }

        @Override
        public void run() {
            try(
                    InputStream is = socket.getInputStream();
                    BufferedReader  br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
                    ){
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(host+"说："+line);
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
