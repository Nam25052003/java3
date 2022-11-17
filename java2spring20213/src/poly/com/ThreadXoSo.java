/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com;

import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author adm1n
 */
public class ThreadXoSo extends Thread implements  Runnable
{
private JTextField txt;

    public JTextField getTxt() {
        return txt;
    }

    public void setTxt(JTextField txt) {
        this.txt = txt;
    }

    public ThreadXoSo(JTextField txt) {
        this.txt = txt;
    }

    public ThreadXoSo() {
    }

    @Override
    public void run()
    {
        Random rd= new Random();
        while(true)
        {
            int num=rd.nextInt(10);
            txt.setText(num+"");
            try
            {
                Thread.sleep(10);
            }
            catch(Exception ex)
            {
                break;
              
            }
        }
    }
    
    
}
