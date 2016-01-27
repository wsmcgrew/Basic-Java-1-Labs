/**
 * Exercise 5
 * Lab 3 
 * Author: William McGrew
 * **/
 
 import java.util.Scanner;
 
 public class Exercise5
 {
     public static void main(String[] args){
     
    Scanner input = new Scanner(System.in);
    int number = 0;
    float average;
    float totalOfGrades = 0;
    float grade = 0;
    
    while(grade != -1){
        System.out.println("enter a grade or -1 to quit");
        grade = input.nextFloat();}
        
        if(grade != -1){
            totalOfGrades = totalOfGrades + grade;
            number = number + 1;
    }
    average = totalOfGrades / (float) number;
    
    System.out.println("average is:" + average);
    
     }
 }