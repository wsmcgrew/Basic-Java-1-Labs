/** William McGrew
 * last modified: 2/24/16
 * Lab 5**/
 import java.util.Random;
 
 public class Ex2Lab5
 {
     static Random die = new Random();
     
     // simulate die roll
     public static int rollDie(){
         System.out.println("6 sided die roll");
         int result;
         
         result = die.nextInt(6) + 1;
         
         return result ;
     }// end method roll die
     
     //simulate n sided die roll
     
     public static int rollDie(int sides){
         System.out.println("roll n sided die");
         int result;
         
         result = die.nextInt(sides) + 1;
         
         return result;
         
     }// end method roll Die numero dos
     public static void main(String[] args){
         int dieFace;
         
         dieFace = rollDie();
         
         System.out.println("First roll is " + dieFace);
         
         dieFace = rollDie(100);
         
         System.out.println("Second roll is " + dieFace);
         
     }// end main method 
     
 }//end class ex2 lab 5