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
public class TestSinhVien {
    public static void main(String[] args) {
         byte chon=0;
        
        System.out.println("bạn là sinh viên nào 1:it, 2: biz");
        Scanner nh = new Scanner(System.in);
        chon=nh.nextByte();
        
        if (chon==1)
        {SinhVienIt it = new SinhVienIt();
         it.nhap();
         it.xuat();
                
        }
        else
        {SinhVienBiz biz = new SinhVienBiz();
        biz.nhap();
        biz.xuat();
        System.out.println("xuất thông tin tostring " + biz);
        }
    }
}
