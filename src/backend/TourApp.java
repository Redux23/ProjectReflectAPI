/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author redux23
 */
import java.util.ArrayList;
import java.util.Date;

/**
 * This is the main class run-time environment method.  
 * @author Bright Osuagwu (2014649)
 * Date of Creation: 20-12-2020
 * Dept: School of Computing (OOP Coursework)
 * @version 1.0
 *
 */
public class TourApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //initializing variables to store datetime in milli seconds.
        long timeStamp = System.currentTimeMillis();
        long timeStamp2 = System.currentTimeMillis();
        //Assigning a variable string value for different TourPackage descriptions.
        String tourDesc = "A tour package added to TourApp: ";
       
       
     
       //Instantiated the cityTour and sightSeeingTour objects.  
        CityTour cityTour1 = new CityTour(true, 20, "", "York", 60);
        SightSeeingTour sightSeeingTour = new SightSeeingTour("", "Carlisle", 20, 100);
        ArrayList<TourPackage> tourPackage = new ArrayList(); //Created an ArrayList for the TourPackage.
        //Adding packages to the TourPackage ArrayList
        tourPackage.add(cityTour1);
        tourPackage.add(sightSeeingTour);
        
        //Instantiated tourist object.
        Tourist tourist = new Tourist("Adam", "Carlisle", AudioLanguage.ENGLISH);

        //instantiating booking object.
        Booking booking1 = new Booking(tourist, sightSeeingTour, new Date(timeStamp));

        //Assigning a variable string value for a custom TourPackage description.
        String withoutGuideDesc = "A custom tour package created for " + tourist.getName() +
                " without a guide: ";
        //Instantiaing custom tour package without personal guide.
        CityTour custTourPackage = new CityTour (false, 0, withoutGuideDesc, "York", 60);
        //Instantiating booking2 object for the ArrayList iteration
        Booking booking2 = new Booking(tourist, custTourPackage, new Date(timeStamp2));
   
        //New booking for Tourist without personal guide.
        String bookingDesc = "A booking created for ";
        Booking booking3 = new Booking(tourist, custTourPackage, new Date(timeStamp));
        
        //Initializing an array list of newly added bookings
        ArrayList<Booking> newBooking = new ArrayList<>();
        newBooking.add(booking1);
        newBooking.add(booking2);
       
       //Instantiated booking util object to access calculateBill method
       BookingUtil bookingUtilOne = new BookingUtil();
       double[] totalBillOne = bookingUtilOne.calculateBill(newBooking, tourist);
       
       custTourPackage.updateTourCost(100); // updating custom tour package cost
       String updatedDesc = "A custom package cost updated: ";
       CityTour cityTour2 = new CityTour(false, 0, "", "York", 100);
       
       
       BookingUtil bookingUtilTwo = new BookingUtil();
       double[] totalBillTwo = bookingUtilTwo.calculateBill(newBooking, tourist);
       
        System.out.println(tourDesc + cityTour1.toString()); //Printng line 1.
        System.out.println(tourDesc + sightSeeingTour.toString() + ".");//Printing line 2.
        System.out.println(tourPackage.size() + " tour packages are available in TourApp."); //printing line 3.
        System.out.println("Tourist " + tourist.getName() + " added to the TourApp!"); //Printing line 4.
        System.out.println(tourist.getName() + ", booked " + sightSeeingTour + " on "
                + booking1.getDatetimeString()); //Printing line 5.
        System.out.println(custTourPackage.getDescription() + custTourPackage + ".");  //Printing line 6.
        System.out.println(bookingDesc + tourist.getName() + ", "
                + custTourPackage + ". " + booking3.getDatetimeString()); //Printing line 7.

       //Printing initial total bill cost
       System.out.println("Total bill for " + tourist.getName() + ": " + "£" + totalBillOne[0]);
       //Printing initial discounted bill cost
       System.out.println("Discounted bill for " + tourist.getName() + ": " + "£" + totalBillOne[1]);
       
       //Printing line 10
       System.out.println(updatedDesc + cityTour2  + ".");
       
       //Printing updated total bill cost
       System.out.println("Total bill for " + tourist.getName() + ": " + "£" + totalBillTwo[0]);
       //Printing updated dicounted bill cost
       System.out.println("Discounted bill for " + tourist.getName() + ": " + "£" + totalBillTwo[1]);
       
       
       

    }
   
}

