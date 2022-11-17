/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide3;

/**
 *
 * @author adm1n
 */
public class SinhVien {
    private String ten;
    private double diem;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public SinhVien() {
    }

    public SinhVien(String ten, double diem) {
        this.ten = ten;
        this.diem = diem;
    }
    
}
