/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction.Abstract;

/**
 *
 * @author Nguyen Hung Son
 */
public class JavaCoding extends AbstractJob{

    @Override
    public String getJobName() {
        return "Coding Java";
    }

    @Override
    public void doJob() {
        System.out.println("Coding Java...");
    }
   
}
