/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide6thread;

import java.util.Random;

/**
 *
 * @author adm1n
 */
public class Debugfile {
    public static void main(String[] args) {
        
        int i;
        Random nn = new Random();
        while(true)
        {
        i=nn.nextInt(10);
        if (i==9)
        {
           
         System.out.println("Thoat");
        break;
        }
        }
    }
    }

