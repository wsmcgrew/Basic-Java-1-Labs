/** William McGrew
 * Last Modified: 2/3/16
 * lab4
 * "for" loop statements**/
 
 import java.util.Scanner;
 
 public class Ex1L4
 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         int number;
         
         System.out.println("Enter a number to count to");
         number = input.nextInt();
         
         
         for(int c = 0; c < number; c = c + c + 1){
             System.out.println(c + "iterations of the loop");
         }

     }
 }