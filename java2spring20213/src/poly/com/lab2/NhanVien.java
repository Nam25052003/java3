/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab2;

/**
 *
 * @author adm1n
 */
public class NhanVien {
    public String ma;
    public String ten;
    boolean gioitinh;
    public int vaitro;

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, boolean gioitinh, int vaitro) {
        this.ma = ma;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.vaitro = vaitro;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getVaitro() {
        return vaitro;
    }

    public void setVaitro(int vaitro) {
        this.vaitro = vaitro;
    }
    
}

