/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadOverrided.Overrided;

import java.time.Year;

/**
 *
 * @author Nguyen Hung Son
 */
public class Nguoi {
    private int tuoi;
    
    public int tinhTuoi(int tuoi){
        return (Year.now().getValue() - tuoi);
    }
}
