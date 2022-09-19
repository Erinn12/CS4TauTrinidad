/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02.tau.trinidad;
import java.util.Scanner;

/**
 *
 * @author erinnicolea.trinidad
 */
public class Ex02TauTrinidad {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String option;
        int range = 10;
        int min = 1;
        int guesses = 3;
        
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Welcome to Higher or Lower! What will you do?\n"+
                "-Start game\n"+
                "-Change settings\n"+
                "-End application");
        option = sc.nextLine();
        switch(option){
            case "Start game":
                String repeat = null;
                do {
                int random = (int) Math.floor(Math.random()*range) + min;
                for(int remaining=guesses; remaining>0; remaining--) {
                    System.out.printf("You have %d guess(es) left. What is your guess?", remaining);
                    int answer = Integer.parseInt(sc.nextLine());
                    if (answer == random) {
                        System.out.println("You got it!");
                        break;
                    }
                    else if (answer > random) {
                        System.out.printf("Guess lower!");
                    }
                    else {
                        System.out.printf("Guess higher!");   
                    }
                } 
                for(int remaining=guesses; remaining==0;) {
                System.out.println("You lost...");
                }
                System.out.print("Play again (y/n)?");
                repeat = sc.nextLine();
                }while(repeat.equalsIgnoreCase("y"));
                break;

            case "Change settings":
                do {
                System.out.print("What is the lower limit of the random number?");
                min = Integer.parseInt(sc.nextLine());
                System.out.print("What is the upper limit of the random number?");
                range = Integer.parseInt(sc.nextLine());
                System.out.print("How many guesses are allowed?");
                guesses = Integer.parseInt(sc.nextLine());
                System.out.printf("Lower Limit: %d\n"+ "Upper Limit: %d\n" + "Guesses: %d\n", min, range, guesses);
                System.out.print("Do you want to change anything else (y/n)?");
                repeat = sc.nextLine();
                }while(repeat.equalsIgnoreCase("y"));
        } 
        
        
        }while(!option.equalsIgnoreCase("End application"));
        System.out.print("Thank you for playing!");
    }
    
}
