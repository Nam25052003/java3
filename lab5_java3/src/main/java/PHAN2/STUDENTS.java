
package PHAN2;


public class STUDENTS {
    public  String maSV;
    public  String hoTen;
    public  String eMail;
    public  String soDT;
    public  String diaChi;
    public boolean gioiTinh;

    public STUDENTS() {
    }

    public STUDENTS(String maSV, String hoTen, String eMail, String soDT, String diaChi, boolean gioiTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.eMail = eMail;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
