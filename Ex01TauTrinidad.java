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
        //Sum
        int ageSum = age+age2+age3;
        //Comparison
        boolean sameSubject = favSubject2 == favSubject3;
        
        //Output
        System.out.printf("%s and %s have an age difference of %i years.", name,name3,ageDiff);
        System.out.printf("The ages of the three people combined is %i", ageSum);
        System.out.printf("Isaac and Jasmine have the same favorite subject.: %b", sameSubject);
    }
}