/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide6;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adm1n
 */
public class DemoThreadcach2 implements Runnable{

    @Override
    public void run() {
        int a;
       for(int i=1; i<=10000000; i++ )
       {//System.out.println(i);
          Random nn = new Random();
            a=nn.nextInt(10-0 + 1);////b-a +1
           System.out.print(" " + a);
       
       try {
            
               Thread.sleep(1000);
               
           } catch (InterruptedException ex) {
               Logger.getLogger(DemoThread.class.getName()).log(Level.SEVERE, null, ex);
           }
       }

    }
    
}
