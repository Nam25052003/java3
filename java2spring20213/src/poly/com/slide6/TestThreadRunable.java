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
public class TestThreadRunable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DemoThreadcach2());
        t1.start();
        Thread t2 = new Thread(new DemoThreadcach2());
        t2.start();  
        
    }
}
