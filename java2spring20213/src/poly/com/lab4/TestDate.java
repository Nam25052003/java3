/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab4;

import java.text.SimpleDateFormat;
import java.util.Date;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author adm1n
 */
public class TestDate {
    public static Date parse(String chuoi, String mau) throws Exception
    {
        SimpleDateFormat format= new SimpleDateFormat();
        format.applyPattern(mau);
        Date d=format.parse(chuoi);
        return d;
    }
}
