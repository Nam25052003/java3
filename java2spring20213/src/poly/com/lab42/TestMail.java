/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab42;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author adm1n
 */
public class TestMail {
    
    public static void parseEmail(String email) throws Exception
    {
        String mau="\\w+@\\w+(\\.\\w+){1,2}";
        Pattern pattern = Pattern.compile(mau);
        Matcher matcher= pattern.matcher(email);
        if(matcher.matches()==false)
            throw  new Exception();
        
    }
}
