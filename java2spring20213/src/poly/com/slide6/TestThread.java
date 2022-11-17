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
public class TestThread {
    public static void main(String[] args) {
        DemoThread t1=new DemoThread();
        t1.start();
        System.out.print("\n");
        DemoThread t2=new DemoThread();
        t2.start();    
        DemoThread t3=new DemoThread();
        t3.start();   
        
    }
   
}
