/** William McGrew
 * Lab 7
 * 3/9/16**/
 import java.util.Scanner;
 import java.util.Formatter;
 import java.io.File;
 
 public class Ex2Lab7 {
     
     public static void main(String[] args) throws Exception
     {
         File text = new File("example.txt");
         
         Scanner fileReader = new Scanner(text);
         
         Formatter output = new Formatter("sentence.txt");
         
         int index;
         String firstLine;
         String firstSentence;
         
         firstLine = fileReader.nextLine();
         System.out.println("firstLine: " + firstLine);
         
         index = firstLine.indexOf('.');
         
         firstSentence = firstLine.substring(0, index + 1);
         System.out.println("firstSentence: " + firstSentence);
         
         output.format(firstSentence);
         
         output.close();
         fileReader.close();
     }// end main method
 }//end class Ex2Lab7