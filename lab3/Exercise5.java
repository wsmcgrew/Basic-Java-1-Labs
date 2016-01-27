/**
 * Exercise 4
 * Lab 3 
 * Author: William McGrew
 * **/
 
 import java.util.Scanner;
 
 public class Exercise4
 {
     public static void main(String[] args){
     
    Scanner input = new Scanner(System.in);
    int number;
    float average;
    float totalOfGrades = 0;
    float grade; 
    
    System.out.println("enter a number");
    number = input.nextInt();
    
    int c = 0;
    while(c < number){
        
        System.out.println("enter a grade");
        grade = input.nextFloat();
        
        totalOfGrades = totalOfGrades + grade;
        c = c + 1;
    }
    average = totalOfGrades / (float) number;
    
    System.out.println("average is: " + average);
    
     }
 }