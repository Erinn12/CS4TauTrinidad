/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.tau.trinidad;

/**
 *
 * @author TAU
 */
public class Ex01TauTrinidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Person 1
        String name = "Erin";
        int age = 15;
        String favSubject = "Biology";
        //Person 2
        String name2 = "Jasmine";
        int age2 = 23; 
        String favSubject2 = "Math";
        //Person 3
        String name3 = "Isaac";
        int age3 = 10;
        String favSubject3 = "Math";
        // Operations
        //Difference
        int ageDiff = age-age3;
        //Comparison
        boolean same = (favSubject2 == favSubject3);
        //Output
        System.out.printf(%s and %s have an age difference of %i years,name,name3,ageDiff);
        // TODO code application logic here
    }
    
}
