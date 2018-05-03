/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Nguyen Hung Son
 */
public class Student implements Comparable<Student> {

    int rollno;
    String name, address;

    public Student(int rollno, String name,
            String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.rollno + " " + this.name
                + " " + this.address;
    }

    @Override
    public int compareTo(Student o) {
        return (this.name.compareTo(o.name));
    }
}
