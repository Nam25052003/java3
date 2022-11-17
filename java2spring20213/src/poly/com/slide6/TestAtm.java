/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide6;

/**
 *
 * @author adm1n
 */
public class TestAtm {
    public static void main(String[] args) 
    {
    
        final Customer c= new Customer();
        Thread th1= new Thread()
        {
            public void run()
            {
                c.withdraw(30000);
            }
        };
        th1.start();
        Thread th2 = new Thread()
        {
            public void run()
            {
                c.deposit(20000);
            }
            
        };
        th2.start();
    }
}
