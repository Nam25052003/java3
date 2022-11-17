package slide7;

import java.net.InetAddress;

public class timdiachiip {

    public static void main(String[] args) {
        try {
            InetAddress address[] = InetAddress.getAllByName("dantri.com.vn");
            for (int i = 0; i < address.length; i++) {
                System.out.println("Address : " + (i + 1) + " : " + address[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
