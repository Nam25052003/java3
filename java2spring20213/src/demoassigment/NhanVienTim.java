/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoassigment;

import java.io.Serializable;

/**
 *
 * @author adm1n
 */
public class NhanVienTim extends NhanVien implements Serializable{
 private int vitri;

    public int getVitri() {
        return vitri;
    }

    public void setVitri(int vitri) {
        this.vitri = vitri;
    }

    public NhanVienTim(int vitri, String manv, String hoten, int tuoi, String email, double luong, String anh) {
        super(manv, hoten, tuoi, email, luong, anh);
        this.vitri = vitri;
    }

    

    public NhanVienTim()
    {
    }


 
    
}
