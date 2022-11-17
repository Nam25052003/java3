/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab6thread;

import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author adm1n
 */
public class ThreadXoSo extends Thread implements Runnable{
    
    private JTextField txt;

    public JTextField getTxt() {
        return txt;
    }

    public void setTxt(JTextField txt) {
        this.txt = txt;
    }

    public ThreadXoSo() {
    }

    public ThreadXoSo(JTextField txt) {
        this.txt = txt;
    }
    
    @Override
    public void run()
    {
        Random rd = new Random();
        while(true)
        {
            int so;
            so=rd.nextInt(10);
            txt.setText(so+"");
           try
           {
            Thread.sleep(20);
           }
           catch(Exception ex)
           {
               ex.printStackTrace();
           }
            
        }
        
        
    }
    
    
    
    
}
