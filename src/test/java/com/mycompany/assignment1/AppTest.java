package com.mycompany.assignment1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
   
        //CopyAndDuplicateStuds(stud);
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /*private static void CopyAndDuplicateStuds(Student[] stud){
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
        Scanner input = new Scanner(System.in);
        
        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        for(Student s: list){
            studentMap.put(s.getPhoneNumber(),s);
        }
        
        System.out.println("Please enter the phone number of the person you would like to search?\n");
        int number = input.nextInt();
        System.out.printf("\nThe contacts name is: ");
        System.out.printf(studentMap.get(number).getFirstName()+" "+studentMap.get(number).getLastName()+", Student number: "+studentMap.get(number).getStudentNumber());
    }*/

    
    
   
}
