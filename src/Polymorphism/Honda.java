/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Nguyen Hung Son
 */
public class Honda extends Bike{
    int speed = 150;
    public static void main(String[] args) {
        Bike bike = new Honda();
        System.out.println(""+bike.speed);
    }
}
