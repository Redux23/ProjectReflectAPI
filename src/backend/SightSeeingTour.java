/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 * This class is a concrete sub-class of the TourPackage abstract class
 * @author Bright Osuagwu (2014649)
 * Date of Creation: 14-12-2020
 * Dept: School of Computing (OOP Coursework)
 * Version 1.0   
 */
public class SightSeeingTour extends TourPackage{
    //Object level attributes for the sightSeeingTour class
    private double ticketCost;
    private double newTicketCost;
     
   
   
    public SightSeeingTour(String p_description,
            String p_location,
            double p_tourCost,
            double p_ticketCost){
        //A Constructor to set the sub-class object plus the superclass objects
     super(p_description, p_location, p_tourCost);
     this.ticketCost = p_ticketCost;
    }
   
   
    public double getTicketCost(){
    // Getter method to get cost of ticket of SightSeeing selected by user.
        return this.ticketCost;
    }
   // Setter method to update the new Tickt cost.
    public void updateTicketCost(double p_newTicketCost){
     this.newTicketCost = p_newTicketCost;
    if(this.newTicketCost > this.ticketCost)
       this.ticketCost = this.newTicketCost;
    }
   
     // Returning the object-level summary with the super-class objects from the TourPackage class.
    @Override public String toString(){
       String output = "A sightseeing tour in and around " + super.getLocation()
               + " with a total cost of " + "£" + this.getCost();
       if(!(this.ticketCost > 0)){
           output += " including tickets";
       }
       return output;
   }
   
    //returns sum of cost.
    @Override public double getCost(){
        return this.ticketCost + super.getTourCost();
    }
}
