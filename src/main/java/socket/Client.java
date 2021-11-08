package socket;

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
            System.out.println("正在连接服务器...");
            socket = new Socket("176.221.14.18",12306);
            System.out.println("与服务器端连接成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        /**  客户端开始工作的方法 start()  */
        try(
                PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8")),true);
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
                ){
            Scanner scan = new Scanner(System.in);
            while (true){
                String line = scan.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                pw.println(line);
                while ((line = br.readLine())!= null){
                    System.out.println(line);
                }
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
}
