/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.demothread;

/**
 *
 * @author adm1n
 */
public class TestThread {
    public static void main(String[] args) {
      MyThread t1 = new MyThread();
      t1.start();
      MyThread t2 = new MyThread();
      t2.start();
      MyThread t3 = new MyThread();
      t3.start();
      
      
    }
}
