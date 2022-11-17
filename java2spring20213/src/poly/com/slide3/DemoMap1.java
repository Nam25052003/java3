/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author adm1n
 */
public class DemoMap1 {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<String, Double>();
        map.put("samsung", 1000.0);
        map.put("nokia", 6000.0);
        //map.put("nokia",7000.0);
        
    Set<String> keys=map.keySet();
    for(String key:keys)
    {
        Double gia=map.get(key);
        System.out.println(gia +" ");
    }
        
        
        
        
    }
}
