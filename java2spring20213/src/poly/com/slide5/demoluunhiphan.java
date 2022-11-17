/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author adm1n
 */
public class demoluunhiphan {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       FileOutputStream fos = new FileOutputStream("file1.txt");
       String text="Xin chao toi la Le Anh Tu";
       byte[] mangluu=text.getBytes();
       fos.write(mangluu);
        System.out.println("Luu thanh cong");
       
    }
  
    
    
}
