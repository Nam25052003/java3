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
public class SinhVienBiz extends SinhVienPoly{
private double diemMarketing;
private double diemsales;
   public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public void setDiemsales(double diemsales) {
        this.diemsales = diemsales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public double getDiemsales() {
        return diemsales;
    }

    public SinhVienBiz(double diemMarketing, double diemsales, String ten, String nganh) {
        super(ten, nganh);
        this.diemMarketing = diemMarketing;
        this.diemsales = diemsales;
    }

    @Override
    public String toString() {
        return "SinhVienBiz{" + "diemMarketing=" + diemMarketing + ", diemsales=" + diemsales + '}' + "hoc luc" + this.xeploai(this.getDiemtb());
    }

   public SinhVienBiz() 
   {
    }  //buộc có vì khi ta new mới một đối tượng bên lớp Testpoly.


    @Override 
    public void nhap()   
     {
         super.nhap(); 
        Scanner nh = new Scanner(System.in);
        System.out.print("Diem Marketting: ");
        this.setDiemMarketing(nh.nextDouble());
        System.out.print("Diem Sales: ");
        this.setDiemsales(nh.nextDouble());
      
     }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println(this.getDiemMarketing());
        System.out.println(this.getDiemsales());
        System.out.println("điểm trung bình là" + this.getDiemtb());
        System.out.println("xếp loại"+ this.xeploai(this.getDiemtb()));
   
    }
   
    @Override
    public double getDiemtb() {
    return (2*this.diemMarketing + this.diemsales)/3;
    }
}