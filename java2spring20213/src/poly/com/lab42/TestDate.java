/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab42;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author adm1n
 */
public class TestDate {
    public static Date parse(String chuoi, String mau) throws Exception
    {
        try
        {
        SimpleDateFormat format= new SimpleDateFormat();
        format.applyPattern(mau);
        Date d=format.parse(chuoi);
        return d;
        }
        catch(Exception ex)
        {
            throw  new Exception();
        }
    } 
}
