package socket;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Xgq
 * @date 2021/11/315:58
 * @Title Client
 * @Package Socket
 * @Description
 *
 *    聊天室客户端
 *    java.net.Socket 套接字
 *    Socket封装了TCP协议的通讯细节，使用它可以与远端计算机建立连接，并基于一个输入与输出流的读写完成与远端计算机的交互
 *
 */
public class Client {
    private Socket socket;
    public Client() {
        /**  初始化客户端  new Socket ->  host:本机 port: 端口  */
        try {
            socket = new Socket("176.221.14.18",12306);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        /**  客户端开始工作的方法 start()  */
        try(
                PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8")),true);
                ){
            Scanner scan = new Scanner(System.in);
            ServerHandler serverHandler = new ServerHandler();
            Thread t = new Thread(serverHandler);
            t.start();
            while (true){
                String line = scan.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
    /**  该线程用于循环读取服务端发送过来的消息 内部类  */
    private class ServerHandler implements Runnable{

        @Override
        public void run() {
            try(
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
                    ) {
                String message ;
                while ((message = br.readLine()) != null){
                    System.out.println(message);
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
