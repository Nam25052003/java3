/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide6thread;

/**
 *
 * @author adm1n
 */
public class Customer {
    int amount = 1000;
    public synchronized void withdraw(int m)
    {
        System.out.println("Bạn đang rút tiền" + m);
        if(amount<m)
        {
            System.out.println("Bạn Không đủ tiền rút");
            
        
         try
            {
             wait();
                     }
            catch(Exception ex)
            {
            ex.printStackTrace();
            }
        }
        else
        {   amount=amount -m;
         System.out.println("Bạn đã rút tiền thành công" + m + "số dư còn lại:" + amount );
        }  
        
    }
    
    synchronized  void deposit(int m)
    {
        System.out.println("Bạn đang nạp tiền " + m);
        amount = amount + m;
        System.out.println("Nạp Tiền thành công");
        notify();
    }
    
    
}
