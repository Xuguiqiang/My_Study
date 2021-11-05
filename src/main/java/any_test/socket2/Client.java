package any_test.socket2;

import com.sun.org.apache.xml.internal.security.algorithms.MessageDigestAlgorithm;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * @author Xgq
 * @date 2021/11/58:37
 * @Title Client
 * @Package
 * @Description
 */
public class Client {
    private Socket socket;
    public Client() {
        try {
            socket = new Socket("localhost",12306);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try(
                OutputStream os = socket.getOutputStream();
                PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(os,"UTF-8")),true);
                ){
            Scanner scanner = new Scanner(System.in);
            String message;
            while (true){
                message = scanner.nextLine();
                if ("exit".equals(message)){
                    break;
                }
                pw.println(message);
            }
        }catch (IOException e){
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
