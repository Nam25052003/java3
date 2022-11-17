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
public class NhanVien implements Serializable{
    private String manv;
    private String hoten;
    private int tuoi;
    private String email;
    private double luong;
    private String anh;

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, int tuoi, String email, double luong, String anh) {
        this.manv = manv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

   
    
    
}
