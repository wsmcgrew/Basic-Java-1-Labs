/**William McGrew
 * modified date3/2/16
 * review of Array data structure -- Binary value table**/
 import java.util.Scanner;
 
 public class Ex2Lab6
 {
     public static void main(String[] args){
         Scanner userGuess = new Scanner(System.in);
         String[] binary = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000"};
         
         int index;
         
         while(true){
          System.out.println("Enter a number between 0 and 8");
          index = userGuess.nextInt();
          
          System.out.printf("%d is %s in binary%n", index, binary[index]);
         }//end while loop
     }// end main methd
 }// end class Ex1Lab6