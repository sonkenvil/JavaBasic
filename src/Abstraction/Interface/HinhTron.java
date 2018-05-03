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
public class HinhTron implements Hinh{
    private float banKinh;

    @Override
    public double tinhChuVi() {
        return (2*Math.PI*banKinh);
    }

    @Override
    public double tinhDientich() {
        return (2*Math.PI*Math.PI);
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }
    
}
