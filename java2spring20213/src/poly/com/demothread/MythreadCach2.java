/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.demothread;

import java.util.Random;

/**
 *
 * @author adm1n
 */
public class MythreadCach2 implements Runnable{

    @Override
    public void run() {
    {int i;
   while(true)
   {

       Random rd = new  Random();
       i=rd.nextInt(10-0+1);
       System.out.print("" + i);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
        ex.printStackTrace();
    }
       
   }
}
    }
    
}
