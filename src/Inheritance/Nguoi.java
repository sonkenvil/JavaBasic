/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.Calendar;

/**
 *
 * @author Nguyen Hung Son
 */
public class Nguoi {
   protected String hoTen;
   protected int namSinh;
   protected String queQuan;
   
   protected int tinhTuoi(int namSinh){
       int year = Calendar.getInstance().get(Calendar.YEAR);
       return (year - namSinh);
   }
}
