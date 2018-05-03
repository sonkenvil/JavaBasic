/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author Nguyen Hung Son
 */
public class Test {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.setMaSV("B13DDCN332");
        sv.setTenSV("Nguyen Hung Son");
        sv.setQueQuan("Ha Dong");
        System.out.println("MSV: "+ sv.getMaSV() + " Ho ten: "+ sv.getTenSV() + " Que quan : " + sv.getQueQuan());
    }
}
