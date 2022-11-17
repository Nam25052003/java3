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
public class DemoList {
    public static void main(String[] args) {
        ArrayList<Integer> arrdanhsach = new ArrayList<>();
        arrdanhsach.add(1);
        arrdanhsach.add(100);
        arrdanhsach.add(200);
        arrdanhsach.add(300);    
        arrdanhsach.remove(1);
        
        arrdanhsach.set(2, 3000000);
        
        //2 cách
        //cách 1 dùng for
        
       /* for(int i=0; i<arrdanhsach.size(); i++)
        {
            System.out.println(arrdanhsach.get(i).toString());
        }
*/
        //cách 2 dùng for each
        for(int i:arrdanhsach )
            System.out.println(i);
        
        
        
        ArrayList<String> arrten = new ArrayList<>();
        
        
        arrten.add("Siênng");
        arrten.add("Năng");
        arrten.add("Cần");
        arrten.add("Cù");
        
        for(String ten: arrten)
            System.out.println(ten);
        
    };
}
