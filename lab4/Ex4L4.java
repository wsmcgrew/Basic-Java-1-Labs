/** William McGrew
 * Last Modified: 2/3/16
 * lab4
 * "Switch statements**/
 
 import java.util.Scanner;
 
 public class Ex4L4
 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         int number;
         
         //question 1
         System.out.println("enter a nuber between 0 and 10");
         number = input.nextInt();
         
         if(number > 0 && number < 11){
             System.out.println(number + " number is valid");}
            else {
                System.out.println(number + " number is not valid");}
    }
 }