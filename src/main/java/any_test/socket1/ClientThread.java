package any_test.socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author Xgq
 * @date 2021/11/419:38
 * @Title ClientThread
 * @Package API Thread
 * @Description server create thread
 */
public class ClientThread implements Runnable {
    private Socket socket;
    private String host;

    public ClientThread(Socket socket) {
        this.socket = socket;
        this.host = socket.getInetAddress().getHostAddress();
    }

    @Override
    public void run() {
        try(
                InputStream isr = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(isr,"UTF-8"));
                ){
            String line ;
            while ((line = br.readLine()) != null){
                System.out.println(host+"客户端说："+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
