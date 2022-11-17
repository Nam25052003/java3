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
public abstract class SinhVienPoly {
 public String hoten;
 public String nganh;
 public abstract double getDiemtb();

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }
  public String xeploai(double diem)
    {
        String xeploai="yeu";
        if (diem>=9)
        xeploai="xuat sac";
            else
               if (diem>=8)
                   xeploai="gioi";
               else
                    if (diem>=6.5)
                        xeploai="kha";
                    else
                        if (diem>=5)
                            xeploai="trung binh";
           
        return xeploai;
    
                  
    }
 public void nhap()
 {
     Scanner nhap = new Scanner(System.in);
     System.out.println("Nhập Họ Tên");
     this.setHoten(nhap.next());
     System.out.println("Nhập ngành:");
     this.setNganh(nhap.nextLine());
         
 }
 public void xuat()
 {
     System.out.println("Họ Tên SV + " + this.getHoten());
     System.out.println("Ngành Học:" + this.getNganh());
 }
  
  
  
}
