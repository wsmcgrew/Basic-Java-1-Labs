/** William McGrew
 * 4/6/16
 * Lab 10**/
 import java.util.Date;
 
 public class Event{
     
     protected String eventName;
     protected String eventLocation;
     protected Date eventDate;
     
     public Event(String name, String location, Date date){
         
         this.eventName = name;
         this.eventLocation = location;
         this.eventDate = date;
     }// end constructor
     
     public String getName(){
         return this.eventName;
     }
     
     public String getLocation(){
         return this.eventLocation;
     }
     
     public String getDate(){
         return this.eventDate.toString();
     }
 }// end event class