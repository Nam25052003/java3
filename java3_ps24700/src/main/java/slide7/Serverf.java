
package slide7;

import java.net.ServerSocket;
import java.net.Socket;


public class Serverf {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("server is connecting...");
            Socket socket = serverSocket.accept();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
