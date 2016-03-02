/**William McGrew
 * modified date3/2/16
 * review of Array data structure**/
 
public class Ex5Lab6
 {
  //dot product method
  static int dotProduct(int[] v1, int[] v2){
    int sum = 0;
    
    for(int i = 0; i <v1.length; i++){
       sum = v1[i] * v2[i] + sum;
    }// end for loop
    return sum;
  }// end dot Produt method.
  

   public static void main(String[] args){
    int[] vector1 = new int[3];
    int[] vector2 = new int[3];
    
    int result;
     
    if(args.length != 6){
       System.out.println("Wrong number of args: " + args.length);}//end if statement
    else{
     for(int i = 0; i < 3; i = i + 1){
      vector1[i] = Integer.valueOf(args[i]);
      vector2[i] = Integer.valueOf(args[i + 3]);}//end for statement
    }//end else statement
     // call dot product method
     result = dotProduct(vector1, vector2);
     
     System.out.println("The dot product is: " + result);
     
   }// end main method
 }// end class Ex3Lab6