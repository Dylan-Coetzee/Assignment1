/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment1;

/**
 *
 * @author Dylan Coetzee
 * @studno 212021265
 * @group  3A
 */
import java.util.*;

public class Student {

    private String studno;
    private String firstname;
    private String surname;
    private int phoneNum;
    public int hash;

    public Student(String stdNo, String fname, String sname, int pNum){
        studno = stdNo;
        firstname = fname;
        surname = sname;
        phoneNum = pNum;
    }

    public String getStudentNumber(){
        return studno;
    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return surname;
    }

    public int getPhoneNumber(){
        return phoneNum;
    }
    
    @Override
    public String toString(){
        return getStudentNumber()+"#"+getFirstName()+"#"+getLastName()+"#"+getPhoneNumber();
    }

    @Override public boolean equals(Object object){
        boolean flag = false;
        Student stud = (Student) object;
        if(this.getStudentNumber().equalsIgnoreCase(stud.getStudentNumber()))
            flag = true;

        if(!(object instanceof Student))
            flag = false;

        return flag;
    }

    @Override public int hashCode(){
        hash++;
        return hash;
    }

}