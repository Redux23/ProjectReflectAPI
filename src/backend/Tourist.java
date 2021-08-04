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
public class Tourist {
    //object-level properties
    private final String NAME;
    private final String COUNTRY;
    private AudioLanguage audioLanguage;
   
    //Contructor containing the params for object-level initialization.
    public Tourist(String name,
            String country,
            AudioLanguage audioLanguage){
       this.NAME = name;
       this.COUNTRY = country;
       this.audioLanguage = audioLanguage;
};
    public String getName(){
        //This getter method collects tourist name.
        return this.NAME;
   };
   
    public String getCountry(){
        //This getter mehtod collects selected country input
        return this.COUNTRY;
    };
   
    public AudioLanguage getAudioLanguage(){
        //This getter method selects from the enum list of languages.
        return this.audioLanguage;
    };
   
    public void setAudioLanguage(AudioLanguage audioLanguage){
        //This setter method sets prefered language from enum list.
        this.audioLanguage = audioLanguage;
    };

    // This method is an override of an Ancestor method toString.
    @Override 
    public String toString(){
        //It returns a concat string OF NAME, COUNTRY and preferred language.
    return   this.NAME + " from " + this.COUNTRY + ", preferred audio language is " + this.audioLanguage;
    };
}
