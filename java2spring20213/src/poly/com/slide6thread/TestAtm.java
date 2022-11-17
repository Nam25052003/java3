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
public class TestAtm {
    public static void main(String[] args) {
     
        final Customer c = new Customer();
    
        Thread th2= new Thread()
        {
            public void run()
            {
                c.deposit(1000);
            }
        };
        th2.start();
               
        
        Thread th1 = new Thread()
        {
            public void run()
            {
                c.withdraw(1500);
            }
        };
        th1.start();
        
        
        
        
        
       
        
        
        
      
    
        
    }
}
