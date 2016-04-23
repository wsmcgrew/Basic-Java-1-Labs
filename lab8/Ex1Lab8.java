/**William McGrew
 * Ex1Lab8 - main driver
 * 3/16/16**/
 import java.util.Scanner;
 
 public class Ex1Lab8{
     
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
         Fraction f1 = new Fraction();
         Fraction f2 = new Fraction();
         Fraction result;
         
         int option;
         int temp;
         
        System.out.println("Enter f1's number");
        temp = input.nextInt();
        f1.setNumerator(temp);
         
        System.out.println("Enter f1's denominator");
        temp = input.nextInt();
        f1.setDenominator(temp);
         
        System.out.println("Enter f2's number");
        temp = input.nextInt();
        f2.setNumerator(temp);
         
        System.out.println("Enter f2's denominator");
        temp = input.nextInt();
        f2.setDenominator(temp);
        
        System.out.println("1: add | 2: subtract | 3: multiply | 4: divide");
        option = input.nextInt();
        
        if(option == 1){
            result = f1.add(f2);
            System.out.printf("%s + %s = %s %n", f1, f2, result);
        }
            else if(option == 2){
                result = f1.subtract(f2);
                System.out.printf("%s - %s = %s %n", f1, f2, result);
            }
            else if(option == 3){
                result = f1.multiply(f2);
                System.out.printf("%s * %s = %s %n", f1, f2, result);
            }
            else if(option == 4){
                result = f1.divide(f2);
                System.out.printf("%s / %s = %s %n", f1, f2, result);
            }

         
     }// and MAIN method
 }//end main driver class