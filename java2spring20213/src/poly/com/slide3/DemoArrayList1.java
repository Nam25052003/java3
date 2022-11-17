/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide3;

import java.util.ArrayList;
import poly.com.lab1.SinhVienIt;

/**
 *
 * @author adm1n
 */
public class DemoArrayList1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrso = new ArrayList<>();
        ArrayList<String> arrchuoi= new ArrayList<>();
              
        arrso.add(4);
        arrso.add(7);
        arrso.add(10);
        arrso.add(1000);
        
        arrso.remove(2);
        
        // có 2 cách xuất mảng.
     /*   for(int i=0; i<arrso.size(); i++)
        {
            System.out.println(arrso.get(i).toString());
        }
       */ 
        //
        for(int i : arrso)
        {
            System.out.println(i);
        }
        
        
        arrchuoi.add("Cần");
        arrchuoi.add("Siêng");
        arrchuoi.add("thái");
        arrchuoi.add("độ");
        arrchuoi.add("tốt");
        
        arrchuoi.set(1, "cù");
        
        for(String chuoi:arrchuoi)
        {
            System.out.println(chuoi);
        }
        
    }
}
