/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 * This class is the class that binds the TourAppAgentView.
 * @author Bright Osuagwu (2014649)
 * Date of Creation: 22-12-2020
 * Dept: School of Computing (OOP Coursework)
 * @version 1.0
 */
public class TourAgent implements Comparable<TourAgent> {
   //object-level properties
private String name;
private String location;


public TourAgent(String name, String location){
    //Contructor containing the params for object-level initialization.
this.name = name;
this.location = location;
}

 
public String getName() {
    //This getter method collects tourist agent's name input.
return name;
}


public String getLocation() {
    //This getter mehtod collects location input
return location;
}

@Override
public String toString() {
  // This method is an override of an Ancestor method toString to formats input.
return "Agent " + name + " is based in " + location;
}

@Override
public int compareTo(TourAgent other) {
    //comparable method for sorting.
return this.name.compareTo(other.getName());
}

}

