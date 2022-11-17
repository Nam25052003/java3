/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author adm1n
 */
public class GhiFileNhiPhan {
    public static void main(String[] args) throws IOException {
       luufile();
       docfile();
               
    }
    public static void luufile() throws FileNotFoundException, IOException
    {
         FileOutputStream fos = new FileOutputStream("file2.txt");
        String text="Lê Anh Tú PHONE:0984814797";
        byte[] luu=text.getBytes();
        fos.write(luu);
        System.out.println("Luu thanh cong");
    }
    
    public static void docfile() throws FileNotFoundException, IOException
    {
        FileInputStream fis = new FileInputStream("file2.txt");
        int c;
        while((c=fis.read())!=-1)
        {
            
            System.out.print((char)c);
        }
    }
    
}
