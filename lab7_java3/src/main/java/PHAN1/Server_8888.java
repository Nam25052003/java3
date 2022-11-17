package PHAN1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_8888 {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("connecting...");
            Socket socket = serverSocket.accept();
            System.out.println("is connect");
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            while (true) {
                double n1, n2, sum;
                n1 = dis.readDouble();
                n2 = dis.readDouble();
                sum = n1 + n2;

                System.out.println("2 so ma client nhap vao: " + n1 + "|" + n2);
                dos.writeDouble(sum);
                dos.flush();
                System.out.println("tong 2 so la: " + sum);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
