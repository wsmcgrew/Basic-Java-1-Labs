/** William McGrew
 * Last Modified: 2/3/16
 * lab4
 * "for" loop statements**/
 
 import java.util.Scanner;
 
 public class Ex2L4
 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         int month;
         
         do
         {
           System.out.println("Enter a months number");
           month = input.nextInt();
          } while(month < 1 || month > 12);

     }
 }