import java.util.Date;

public class EventRunner{
    public static void main(String[] args){
        Date today = new Date();
        
        SchoolEvent party = new SchoolEvent("Code Party", "Math 209", today, "CSCI 1581");
        
        System.out.println(party);
    }//End main Method of Driver
}//end Driver class