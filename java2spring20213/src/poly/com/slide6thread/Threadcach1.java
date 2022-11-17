/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide6thread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adm1n
 */
public class Threadcach1 extends Thread{
    int i;
    @Override
    public void run()
    {
        while(true)
        {
            Random nn = new Random();
          i=  nn.nextInt(10-0+1);
            System.out.print(" " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Threadcach1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
