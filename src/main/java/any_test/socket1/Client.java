package any_test.socket1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Xgq
 * @date 2021/11/419:50
 * @Title Client
 * @Package API Socket
 * @Description client 客户端
 */
public class Client {
    private Socket socket;
    public Client() {
        System.out.println("正在连接到服务端...");
        try {
            socket = new Socket("localhost",12307);
            System.out.println("已经与服务端建立了连接!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try(
                OutputStream os = socket.getOutputStream();
                PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(os,"UTF-8")),true);
                ){
            Scanner scan = new Scanner(System.in);
            while (true){
                String line = scan.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }
        }catch (Exception e){
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
