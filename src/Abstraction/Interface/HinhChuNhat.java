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
public class HinhChuNhat implements Hinh{
    private float chieuDai;
    private float chieuRong;

    @Override
    public double tinhChuVi() {
        return (2*(chieuDai+chieuRong));
    }

    @Override
    public double tinhDientich() {
        return (chieuDai*chieuRong);
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
    
}
