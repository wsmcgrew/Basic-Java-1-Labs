/**William McGrew
 * modified date3/2/16
 * review of Array data structure**/
 
public class Ex3Lab6
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
    int[] vector1 = {1, 2, 3};
    int[] vector2 = {4, 5, 6};
    
    int result;
    
  //Call dot product method
   result = dotProduct(vector1, vector2);
   
   System.out.println("The dot Product is: " + result);
   
   }// end main method
 }// end class Ex3Lab6