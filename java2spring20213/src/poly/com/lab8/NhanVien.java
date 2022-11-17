/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab8;

import java.io.Serializable;

/**
 *
 * @author adm1n
 */
public class NhanVien implements Serializable{
    private String manv;
    private String tennv;

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

    public NhanVien(String manv, String tennv) {
        this.manv = manv;
        this.tennv = tennv;
    }

    public NhanVien() {
    }
    
}
