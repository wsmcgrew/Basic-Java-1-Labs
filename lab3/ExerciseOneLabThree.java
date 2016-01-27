/**
 * ExerciseOne
 * Lab Three
 * William McGrew
 * */
import java.util.Scanner;
 
public  class ExerciseOneLabThree
{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number;
    
    System.out.println("enter a number");
    number = input.nextInt();
    
    System.out.println("before if statement");
    
    if(number % 10 == 0){
        System.out.println("yes,It's divisible by 10");}
       else{
        System.out.println("Not Divisible by 10");}
        
    }
}