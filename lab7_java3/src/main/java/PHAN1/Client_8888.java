package PHAN1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client_8888 {

    public static void main(String[] args) {
        try {
            System.out.println("connecting...");
            Socket socket = new Socket("localhost", 8888);
            System.out.println("is connect");
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            while (true) {
                System.out.println("nhap so thu 1: ");
                dos.writeDouble(new Scanner(System.in).nextDouble());
                dos.flush();
                System.out.println("nhap so thu 2: ");
                dos.writeDouble(new Scanner(System.in).nextDouble());
                dos.flush();
                System.out.println("tong la: " + dis.readDouble());
                System.out.println("tep tuc (Y/N) ?");
                String trl = new Scanner(System.in).nextLine();
                if (trl.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
