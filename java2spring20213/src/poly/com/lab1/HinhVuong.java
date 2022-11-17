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
public class HinhVuong extends HinhChuNhat  
{
    private double canh;

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }
    @Override  
    public void nhap()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println(" Nhập cạnh =");
        this.setCanh(nhap.nextDouble());
        
    }
    @Override
    public void xuat()
    {
        System.out.println("Cạnh Hình vuông là +" + this.canh);
        System.out.println("Chu vi hình vuông là" + this.chuvi(canh, canh));
        System.out.println("Diện tích hình vuôn là+" + this.dientich(canh, canh));
                
                
                
        
    }
}
