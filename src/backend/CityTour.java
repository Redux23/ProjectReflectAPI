
package backend;

/**
 * This class is a concrete sub-class of the TourPackage class.
 * @author Bright Osuagwu (2014649)
 * Date of Creation: 11-12-2020
 * Dept: School of Computing (OOP Coursework)
 * @version 1.0
 */

public class CityTour extends TourPackage {
 // Object level attributes.
 private boolean withGuide;
 private double guideCost;
 private double newGuideCost; // Additional attribute added for comparison.
 
 //Public constructor that takes in local params as well as tourPackage super-class objects to be stored.
 public CityTour(boolean p_withGuide,
         double p_guideCost,
         String p_description,
         String p_location,
         double p_tourCost){
    super(p_description, p_location, p_tourCost);
    this.withGuide = p_withGuide;
    this.guideCost = p_guideCost;
   
 };


public double getGuideCost(){
     // Getter method for the user guide cost.
return this.guideCost;
};


public void updateGuideCost(double p_newGuideCost){
    // Setter method to update the new guide cost.
 this.newGuideCost = p_newGuideCost;
 if (this.newGuideCost > this.guideCost){
   this.guideCost = this.newGuideCost;
 }
};

// Getter method for comparison in getCost()
public boolean isWithGuide(){
return this.withGuide;
};
 

 @Override public String toString(){
     // Setter method to update the new guide cost.
     String output = "A city tour in " + super.getLocation() + " with a total cost of "
         +  "£" + this.getCost();
    if(this.withGuide){
    output += " including a personal guide.";
    }
    return output;
};
 

 @Override public double getCost(){
     //method for adding the guidecost to the getTourCost from the TourPackage abstract class.
     double newCost;
 if(withGuide == true){
 newCost = this.guideCost + super.getTourCost();
 }else{
     return super.getTourCost();
 }
 return newCost;
 };
 
}