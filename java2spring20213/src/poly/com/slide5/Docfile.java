/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author adm1n
 */
public class Docfile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("file1.txt");
        int c;
        while((c=fis.read())!=-1)
        {
            System.out.print((char)c);
            
        }
        fis.close();
    }
  
}
