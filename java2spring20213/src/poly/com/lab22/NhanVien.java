/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab22;

/**
 *
 * @author adm1n
 */
public class NhanVien {
    public String manv;
    public String tennv;
    boolean gioitinh;
    int vaitro;

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
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

    public NhanVien() {
    }

    public NhanVien(String manv, String tennv, boolean gioitinh, int vaitro) {
        this.manv = manv;
        this.tennv = tennv;
        this.gioitinh = gioitinh;
        this.vaitro = vaitro;
    }
    
}
