package com.pluralsight;

public class AirBnb {
    private String name;
    private int numberOfSuites;
    private int numberOfBasicRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


    public AirBnb(String name, int numberOfSuites, int numberOfBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }


    public AirBnb(String name, int numberOfSuites, int numberOfBasicRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfBasicRooms() {
        return numberOfBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){

        if(isSuite){
            //if the number of rooms our guest wants to book is less than or equal to what we have available
            //update booked suites to however many the guest wants to book
            if(numberOfRooms <= getAvailableSuites()){
                bookedSuites +=  numberOfRooms;
                return true;
            }else{
                return false;
            }
        }else{
            if(numberOfRooms<= getAvailableBasicRooms()){
                bookedBasicRooms+= numberOfRooms;
                return true;
            }else{
                return false;
            }
        }
    }


//    The class should also include getAvailableSuites and
//    getAvailableRooms. These are derived getters that SHOULD NOT have
//    a private backing variable. Instead, these getters should calculate the response
//    based on other member variables.
    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableBasicRooms(){
        return numberOfBasicRooms - bookedBasicRooms;
    }










}
