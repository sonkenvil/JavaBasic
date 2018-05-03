/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction.Interface;

/**
 *
 * @author Nguyen Hung Son
 */
public class Test {
    public static void main(String[] args) {
        // Tinh cv va dt
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setChieuDai((float) 3.6);
        hcn.setChieuRong((float) 4.2);
        System.out.println("Chu vi HCN: " + hcn.tinhChuVi()+ " Dien tich HCN: "+ hcn.tinhDientich());
        
        //
        
        HinhTron ht = new HinhTron();
        ht.setBanKinh((float) 6.958);
        System.out.println("");
    }
}
