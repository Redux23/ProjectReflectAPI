
package backend;



//Importing Java class libraries.
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Comparator;

/**
 * This class is created so a tourist can select a package and book it on a specific date and time.
 * @author Bright Osuagwu (2014649)
 * Date of Creation: 13-12-2020
 * Dept: School of Computing (OOP Coursework)
 * @version 1.0
 */
public class Booking {
    // Object level attributes.
    private Tourist tourist;
    private TourPackage tourPackage;
    private Date datetime;
   
   
    public Booking(Tourist p_tourist, TourPackage p_tourPackage, Date p_datetime){  
        //Public constructor that takes in input in local params and stores in the object attributes.
    this.tourist = p_tourist;
    this.tourPackage = p_tourPackage;
    this.datetime = p_datetime;
 
    }
   
 
     
    public Tourist getTourist(){
    // Getter method to get tourist input.
        return this.tourist;
    }
   
   
    public TourPackage getTourPackage(){
    // Getter method to get tourist input.
        return this.tourPackage;
    }
   
   
    public Date getDatetime(){
    // Getter method to get date and time of booking.
        return this.datetime;
    }
   
   
    public String getDatetimeString(){
     // Getter method to get instantiate a datetime string format.  
    SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm");  
    String strDate = formatter.format(this.getDatetime());
    return strDate;
   
    }
   
   
    public static class BookingDateComparator implements Comparator<Booking>{
   // Using the comparator list library class to compare two booking date values.
      @Override
      public int compare(Booking firstBooking, Booking nextBooking){
      return nextBooking.datetime.compareTo(firstBooking.datetime);
      }
     
  }
     
   
    @Override
    public String toString(){
    // An override method that returns a summary string.
        return (this.tourist + " " + this.tourPackage + " " + this.getDatetimeString());
    }
     
                         
}