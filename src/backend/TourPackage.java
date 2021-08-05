
package backend;


/**
 * This class is intended to be used as a super class
 * @author Bright Osuagwu (2014649)
 * Date of Creation: 11-12-2020
 * Dept: School of Computing (OOP Coursework)
 * Version 1.0
 */
public abstract class TourPackage {
   String description;  //To get tourist description
   String location;    // To get tourist location
   double tourCost;   // To get current tour cost
   double newTourCostValue; // New tour cost
   
   
   public TourPackage(String description,
           String location,
           double tourCost){
   this.description = description; // To get the tour description
   this.location = location;  // Location destination
   this.tourCost = tourCost; // Cost of tour
   
};
   
   public String getDescription(){
       // Get the description input
       return this.description;
   };
   
   public String getLocation(){
   // Get the location input    
   return this.location;  
   };
   
   public double getTourCost(){
   // Get the current tour cost
   return this.tourCost;
   };
   
   public void updateTourCost(double newTourCostValue){
    // storing the tourCost value in the initialized variable
   this.newTourCostValue = newTourCostValue;
   if(this.newTourCostValue > this.tourCost){
     this.tourCost = this.newTourCostValue;  
    }
   };
   
   
   @Override public String toString(){
    // Returning the object-level summary  
   return this.description + this.location + this.tourCost;
   };
 
   public abstract double getCost();
   // To be used in the cityTour class
   };