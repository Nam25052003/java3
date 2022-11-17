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
public class TestThreadC1 {
    public static void main(String[] args) {
        
        Threadcach1 t1 = new Threadcach1();
        t1.start();
        System.out.println("\n");
          Threadcach1 t2 = new Threadcach1();
        t2.start();
           Threadcach1 t3 = new Threadcach1();
        t3.start();
    }
}
