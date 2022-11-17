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
public class DemoHaspmap {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<String, Double>();
        map.put("NoKia", 5000.0);
        map.put("SamSung", 5000.0);
        
        map.put("NoKia", 7000.0);
          System.out.println(map.toString());
        Set<String> keys= map.keySet();
        for(String key: keys)
        {
            Double tien=map.get(key);
            System.out.println(tien);
        }
        
    }
}
