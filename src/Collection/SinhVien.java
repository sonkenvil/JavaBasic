/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Nguyen Hung Son
 */
public class SinhVien {
    private String maSV;
    private String hoTen;

    public SinhVien(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
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
    
}
