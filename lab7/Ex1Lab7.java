/**William McGrew
 * Lab 7
 * 3/9/16**/
 import java.util.Scanner;
 
 public class Ex1Lab7{
     
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
         String s1, s2;
         
         String sentinel = "anything but -1";
         
         while(!sentinel.equals("-1")){
             System.out.println("*****Enter your first string: ");
             s1 = input.nextLine();
             
             System.out.println("Enter your second String: ");
             s2 = input.nextLine();
             
                    if(s1.equals(s2)){
                        System.out.println("equal by equals() mehtod");}
                    else{
                        System.out.println("NOT equal by equals() method");}
                
                    if(s1.compareTo(s2) == 0){
                        System.out.println("equal by compareTo()");}
                    else{
                        System.out.println("NOT equal by compareTo()");}
                
                    if(s1.length() == s2.length()){
                        System.out.println("equal by length()");}
                    else{
                        System.out.println("NOT equal by length()");}
                System.out.println("press enter to cont. or -1 to quit");
                sentinel = input.nextLine();
                
         }//end while statement
         
     }// end main method
 }// end class ExLab7