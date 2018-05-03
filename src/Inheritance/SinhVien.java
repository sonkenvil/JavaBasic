/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Nguyen Hung Son
 */
public class SinhVien extends Nguoi{
    private String noiHoctap;
    public SinhVien(){
    }
    public String getNoiHoctap() {
        return noiHoctap;
    }

    public void setNoiHoctap(String noiHoctap) {
        this.noiHoctap = noiHoctap;
    }
     public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
   
}
