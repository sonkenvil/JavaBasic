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
public class Test {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.setNoiHoctap("PTIT");
        sv.setHoTen("Nguyen Hung Son");
        sv.setNamSinh(1995);
        sv.setQueQuan("HT");
        System.out.println("Thong tin Sinh Vien");
        System.out.println("Ho ten : "+ sv.getHoTen()+ " Nam Sinh: "+ sv.getNamSinh());
    }
}
