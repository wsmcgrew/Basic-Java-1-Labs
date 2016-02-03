/** William McGrew
 * Last Modified: 2/3/16
 * lab4
 * "Switch statements                                                                                                              **/
 
 import java.util.Scanner;
 
 public class Ex3L4
 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         int option = 0;
         int number;
         
         
         while(option != 4){
           System.out.println("*******************************");
           System.out.println("1. count to a number");
           System.out.println("2. Check if even or odd");
           System.out.println("3. Print Hey");
           System.out.println("4. QUIT");
           System.out.println("*******************************");
           
           option = input.nextInt();
            switch (option){
              case 1:
                System.out.println("Enter a number to count to");
                number = input.nextInt();
         
         
                for(int c = 0; c < number; c = c + c + 1){
                System.out.println(c + "iterations of the loop");
                }//end of for loop
                break;
                
              case 2:
                System.out.println("Enter a number (even/odd)");
                number = input.nextInt();
                if(number % 2 == 0){
                 System.out.println(number + " is even");}
                 else if(number % 2 == 1){
                  System.out.println(number + " is odd");}
                  else {
                   System.out.println("There must be an error");}
                   break;
              case 3:
                System.out.println("Hey");
                break;
              case 4:
                System.out.println("QUITTING");
                break;
              default: 
                System.out.println("Invalid menu option. try agin kid");
                
            }//end of switch 
         }//end of while
     }
 }