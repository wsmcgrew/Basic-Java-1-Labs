/**William McGrew
 * modified date3/2/16
 * review of Array data structure**/
 import java.util.Random;
 
 public class Ex1Lab6
 {
     public static void main(String[] args){
         Random ranArray = new Random();
         
         int[] spicyArray = new int[10];
         
         String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
         
         for(int c = 0; c < spicyArray.length; c++){
             spicyArray[c] = ranArray.nextInt();
             System.out.printf("At index %d value is: %d%n", c, spicyArray[c]);
             
         }//end for loop
         int index;
         index = ranArray.nextInt(12);
         System.out.printf("Month %d is %s. %n", index + 1, months[index]);
     }// end main methd
 }// end class Ex1Lab6