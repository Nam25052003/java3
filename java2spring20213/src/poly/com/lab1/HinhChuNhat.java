/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab1;

import java.util.Scanner;

/**
 *
 * @author adm1n
 */
public class HinhChuNhat {
    public double rong;
    public double dai;

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public HinhChuNhat() 
    {
        
    }

    public HinhChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "rong=" + rong + ", dai=" + dai + '}' + "chu vi=" + this.chuvi(dai, rong) + "dien tich" + this.dientich(dai, rong);
    }
   public void nhap() 
   {
       Scanner nhap = new Scanner(System.in);
       System.out.println("Nhập Chiều dài=");
       this.setDai(nhap.nextDouble());
       System.out.println("Nhập Chiều Rộng=");
       this.setRong(nhap.nextDouble());
       
   }
    public double chuvi(double dai, double rong)
    {double cv;
    cv=(dai+rong)*2;
     return cv;
    }
    
    public double dientich(double dai, double rong)
    {
        double dt;
        dt=dai*rong;
        return dt;
    }
    public void xuat()
    {
        System.out.println("Chiều dai=" + this.getDai());
        System.out.println("CHiều rộng=" + this.getRong());
        System.out.println("Diện tích là +" + this.dientich(dai, rong));
        System.out.println("Chu Vi= " + this.chuvi(dai, rong));
    }
    
}
