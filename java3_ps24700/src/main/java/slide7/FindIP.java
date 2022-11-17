
package slide7;

import java.net.InetAddress;


public class FindIP {
    public static void main(String[] args) {
        try {
            InetAddress myHost = InetAddress.getLocalHost() ;
            System.out.println("host address " + myHost.getHostAddress());
            System.out.println("host name " + myHost.getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
