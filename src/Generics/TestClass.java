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
public class TestClass<T> {

    T obj;

    TestClass(T obj) {
        this.obj = obj;
    }

    TestClass() {
        
    }

    public T getObject() {
        return this.obj;
    }
   
}

class A{
    public static void main(String[] args) {
       TestClass <Integer> iObj = new TestClass<Integer>(15);
        System.out.println(iObj.getObject());
  
        // instance of String type
        TestClass <String> sObj =
                          new TestClass<String>("GeeksForGeeks");
        System.out.println(sObj.getObject()); 
    }
}
