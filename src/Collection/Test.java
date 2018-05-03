/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Nguyen Hung Son
 */
public class Test {

    public static void main(String[] args) {
       
        SinhVien sv = new SinhVien("o3", "ha");
        SinhVien sv1 = new SinhVien("3l", "tu");
        SinhVien sv2 = new SinhVien("lo", "pk");
        ArrayList<SinhVien> arr = new ArrayList<>();
        arr.add(sv);
        arr.add(sv1);
        arr.add(sv2);
         // Comparator
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                
                return o1.getHoTen().compareTo(o2.getHoTen());
                // return > 0 tang dan,  < 0 giam dan
               }
        });
        System.out.println("Comparator");
        for(SinhVien i : arr){
            System.out.println(""+i.getMaSV()+" "+i.getHoTen());
        }
        
        // comparable
        Student st = new Student(0, "lab", "tran khat chan");
        Student st1 = new Student(1, "h", "lo");
        Student st2 = new Student(2,"s","l");
       
        ArrayList<Student> arr2 = new ArrayList<>();
        arr2.add(st);
        arr2.add(st1);
        arr2.add(st2);
        Collections.sort(arr2);
        System.out.println("Comparable");
        for(Student i : arr2){
            System.out.println(""+i.toString());
        }
    }
}
