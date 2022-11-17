/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab1;

/**
 *
 * @author adm1n
 */
public class Testinterface {
    public static void main(String[] args) {
        DbAction order = new Order();
        DbAction sp = new Product();
        order.insert();
        sp.insert();
    }
}