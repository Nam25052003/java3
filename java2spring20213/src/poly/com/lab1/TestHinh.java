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
public class TestHinh {
    public static void main(String[] args)
    {
        int chon;
        Scanner nhap = new Scanner(System.in);
        System.out.println("1- chu nhat; 2- hinh vuong");
        chon=nhap.nextInt();
        if (chon==1)
        {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap();
        hcn.xuat();
        System.out.println("Xuất đối tương: " + hcn);
        }
        else
        {
        HinhVuong hv = new HinhVuong();
        hv.nhap();
        hv.xuat();
        }
        
    }
}
