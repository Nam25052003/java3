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
public class SinhVienIt extends SinhVienPoly{
private double diemJava;
private double diemCss;
private double diemHtml;

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public SinhVienIt() {
    }

    public SinhVienIt(double diemJava, double diemCss, double diemHtml, String hoten, String nganh) {
        super(hoten, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public String toString() {
        return "SinhVienIt{" + "diemJava=" + diemJava + ", diemCss=" + diemCss + ", diemHtml=" + diemHtml + '}';
    }
        
    @Override
    public double getDiemtb() {
         double d=(diemJava*2+ diemHtml + diemCss)/4;
         return d;
    }
    @Override
    public void nhap()
    {
        super.nhap();
        Scanner nh = new Scanner(System.in);
        System.out.print("Diem Java: ");
        this.setDiemJava(nh.nextDouble());
        System.out.print("Diem HTML: ");
        this.setDiemHtml(nh.nextDouble());
        System.out.print("Diem CSS: ");
        this.setDiemCss(nh.nextDouble());
        
    }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println("điểm java" + this.getDiemJava());
        System.out.println("điểm css" + this.getDiemCss());
        System.out.println("Điem html" + this.getDiemHtml());
        System.out.println("Điểm Trung Bình SV là" + this.getDiemtb());
        System.out.println("Xếp Loại Sinh Viên là :" +   this.xeploai(this.getDiemtb()));
      
        
    }
}
