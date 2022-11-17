/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide3;

import java.util.ArrayList;

/**
 *
 * @author adm1n
 */
public class DemoArrayList {
    public static void main(String[] args) {
       /* ArrayList<Integer> list1= new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(10);
        
        list1.remove(1);
        for(int i=0; i< list1.size(); i++)
        {
            System.out.println(list1.get(i).toString());
        }
        */
    ArrayList<String> lstdsnv = new ArrayList<>();
    lstdsnv.add("anh tu");
    lstdsnv.add("anh Tuan");
    lstdsnv.add("thi lan");
    
    lstdsnv.set(0, "Anh Siêng");
    
    for(String ten:lstdsnv)
    {
        System.out.println(ten);
    }
}
}
