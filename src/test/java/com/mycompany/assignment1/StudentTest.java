/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment1;

//import static org.testng.Assert.*;
import java.util.*;
import junit.framework.Test;
import org.testng.Assert;
/**
 *
 * @author dylan
 */
public class StudentTest {
    
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    Student [] stud = {new Student("212021265","Dylan","Coetzee",844971724),
                           new Student("212021289","Xavier","Rooskrantz",844912331),
                           new Student("212021245","Kurvin","Hendricks",844971572),
                           new Student("212021283","Nicole","Hendricks",844972579),
                           new Student("212021202","Chante","Maroen",844970257),
                           new Student("212021223","Thurstan","Coetzee",844971593),
                           new Student("212021289","Casey","Maniers",844976521),
                           new Student("212021247","Amber","Hugo",844977861),
                           new Student("212021218","Lee_Ann","Master",844971563),
                           new Student("212021213","Amy","Grootboom",844971865),};
    
    
    @org.testng.annotations.Test
    public void getFirstName(){
        CopyAndDuplicateStuds(stud);
        
    }
    
    
    //@org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    //@org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    //@org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    //@org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    private static void CopyAndDuplicateStuds(Student[] stud){
        List<Student> list = new ArrayList<Student>();
        for(Student s: stud){
            list.add(s);
        }
        
        int size = list.size();
        int i = 0;
        while(size < 20){
            list.add(i,list.get(i));
            size++;
            i++;
        }
        MoveToSet(list);
    }
    
    private static void MoveToSet(List<Student> list){
        Set<Student> studentSet = new HashSet<Student>(list);
        MoveToMap(studentSet);
    }
    
    private static void MoveToMap(Set<Student> list){
        //Scanner input = new Scanner(System.in);
        
        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        for(Student s: list){
            studentMap.put(s.getPhoneNumber(),s);
        }
        
        //System.out.println("Please enter the phone number of the person you would like to search?\n");
        int number = 844912331;
        //System.out.printf("\nThe contacts name is: ");
        //System.out.printf(studentMap.get(number).getFirstName()+" "+studentMap.get(number).getLastName()+", Student number: "+studentMap.get(number).getStudentNumber());
        Assert.assertEquals(studentMap.get(number).getStudentNumber(), "212021289");
    }
}
