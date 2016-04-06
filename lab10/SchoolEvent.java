import java.util.Date;

public class SchoolEvent extends Event{
    
    private String courseName;
    
    public SchoolEvent(String name, String location, Date date, String courseName){
        
        super(name, location, date);
        this.courseName = courseName;
    }//end constructor
    
    public String getCourseName(){
        return this.courseName;
    }//end getter method
    
    public String toString(){
        String eventStr;
        eventStr = super.eventName + "," + super.eventLocation + "," +
                    super.eventDate.toString() + "," + this.courseName;
        return eventStr;
    }
}// end subclass School Event