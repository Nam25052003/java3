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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adm1n
 */
public class Ghidulieuluongbyte {
    public static void main(String[] args) {
        
        try {
            ghifile();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ghidulieuluongbyte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        docfile();
    }
    
    
    public static void ghifile() throws FileNotFoundException
    {
        FileOutputStream fos = new FileOutputStream("tu.txt");
        String text = "Lê Anh Tú";
        byte[] mangbyte =text.getBytes();
        try {
            fos.write(mangbyte);
            System.out.println("Lưu thành công");
        } catch (IOException ex) {
            Logger.getLogger(Ghidulieuluongbyte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static void docfile()
    {
        try {
            FileInputStream fis = new FileInputStream("tu.txt");
            int c;
            try {
                while((c=fis.read())!=-1)
                {
                    System.out.print((char)c);
                }
                System.out.println("Đọc thành công");
            } catch (IOException ex) {
             ex.printStackTrace();
            }
            
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
           
        }
        
        
    }
    
    
    
}
