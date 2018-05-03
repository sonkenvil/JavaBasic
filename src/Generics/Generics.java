/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;


/**
 *
 * @author Nguyen Hung Son
 */
public class Generics<T, U> {

    T obj1;
    U obj2;

    Generics(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
    
}

class Main {
    public static void main(String[] args) {
        Generics<String, Integer> obj
                = new Generics<String, Integer>("GfG", 15);
        obj.print();
     
    }
}
