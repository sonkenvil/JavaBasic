/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadOverrided.Overrided;

/**
 *
 * @author Nguyen Hung Son
 */
public class SinhVien extends Nguoi{

    @Override
    public int tinhTuoi(int tuoi) {
        return super.tinhTuoi(tuoi); 
    }
    
}
