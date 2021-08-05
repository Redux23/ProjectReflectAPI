
package backend;


import java.util.ArrayList;
import java.util.Collections;

/**
 * This class implements bill calculation of a specific tourist.
 * @author Bright Osuagwu (2014649)
 * Date of Creation: 13-12-2020
 * Dept: School of Computing (OOP Coursework)
 * @version 1.0
 */
public class BookingUtil {
    // Object method for calculating the bill sum and discount sum of a tourist.
    public double[] calculateBill(ArrayList<Booking> p_booking, Tourist p_tourist){
       
        //Local variables for the calculateBill method.
        double costSum = 0.0;
        double discountSum = 0.0;
        int discount;
       
        // Sorting the bookings in decending order
        Collections.sort(p_booking, new Booking.BookingDateComparator());
       
        // Iteraing over the booking list.
        for(int i = 0; i < p_booking.size(); i++){
        Booking bookingList = p_booking.get(i);
       
        double totalCost = bookingList.getTourPackage().getCost();
        costSum += totalCost;
       //   discount algorithm using tenary operator.
        discount = (i == 0) ? 0 :
            (i == 1) ? 10 :
            (i < 10) ? (i - 1)* 5 + 10 : 50;
       //  System.out.println(discount);
        discountSum += (totalCost - (totalCost * discount/100));
        }
     return new double[] {costSum, discountSum};
    }
   
}
