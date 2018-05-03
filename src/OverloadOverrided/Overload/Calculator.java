/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadOverrided.Overload;

/**
 *
 * @author Nguyen Hung Son
 */
public class Calculator {

    public int add(int a, int b) {
        return (a + b);
    }
   
    public int add(int a, int b, int c) {
        return (a + b + c);
    }
    
    public double add(double a, int b) {
        return (a + b);
    }
    public double add(int a, double b){
        return (a+b);
    }
  
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(""+c.add(3,4));
        System.out.println(""+c.add(3.12, 5));
        System.out.println(""+c.add(5, 6, 7));
    }
}
