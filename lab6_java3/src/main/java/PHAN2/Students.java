/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PHAN2;

/**
 *
 * @author NAM PC
 */
public class Students {

    public int reGid;
    public String name, address, parentname, phone, standard, fees;

    public Students() {
    }

    public Students(int reGid, String name, String address, String parentname, String phone, String standard, String fees) {
        this.reGid = reGid;
        this.name = name;
        this.address = address;
        this.parentname = parentname;
        this.phone = phone;
        this.standard = standard;
        this.fees = fees;
    }

    public int getReGid() {
        return reGid;
    }

    public void setReGid(int reGid) {
        this.reGid = reGid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    
}
