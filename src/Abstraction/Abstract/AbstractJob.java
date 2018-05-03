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
public abstract class AbstractJob {
    public AbstractJob() {
    }
    abstract public String getJobName();
    public abstract void doJob();
    public void show(){
    }
}
