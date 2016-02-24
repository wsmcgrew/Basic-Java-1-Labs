/** William McGrew
 * last modified: 2/24/16
 * Lab 5**/
 import java.util.Scanner;
 
 public class Ex1Lab5
 {
     //build scanner
    static Scanner input = new Scanner(System.in);
     
    public static float fToC(float fTemp){
            float cTemp;
        
            cTemp = (fTemp - 32) * (float)(5.0/9.0);
        
            return cTemp;
    }// end method fToc
    public static float cToC(float cTemp){
            float fTemp;
        
            fTemp = (cTemp * (float)(5.0/9.0)) + 32;
        
            return fTemp;
        
    }//end method cToC
    public static int printMenu(){
    //declare return variable
            int option;
    //print menu
            System.out.println("==============================");
            System.out.println("| F to C  | C to F | Quit  |");
            System.out.println("    1           2       3   ");
            System.out.println("==============================");
    //promt user for input
    //read input form user
            System.out.println(" what will your option be?");
            option = input.nextInt(); 
            
            return option;
        
    }// end method print Menu
    
     public static void main(String[] args){
            float oldTemp;
            float newTemp;
            
            int option = 0;
            
            while(option != 3){
                option = printMenu();
                    switch(option){
                        case 1:
                            System.out.println("enter a temp in fahrenheit");
                            oldTemp = input.nextFloat();
                            newTemp = fToC (oldTemp);
                            System.out.println (oldTemp + " in F is "+newTemp+ " in C");
                            break;
                        case 2:
                            System.out.println("enter a temp in celsius");
                            oldTemp = input.nextFloat();
                            newTemp = cToC (oldTemp);
                            System.out.println (oldTemp + " in C is "+newTemp+ " in F ");
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid menu option");
                            break;
                    }//end switch
                    
            }//end while loop
     }// end main method
     
 }// end class lab 5 ex 1