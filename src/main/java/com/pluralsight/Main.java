package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //making collection of rooms
        ArrayList<Room>rooms = new ArrayList<>();


        //rooms with number of beds
        Room r101 = new Room(1);
        Room r102 = new Room(2);
        Room r103 = new Room(2);
        Room r104 = new Room(2);

        //add room(r101) to our room collection
        rooms.add(r101);
        rooms.add(r102);
        rooms.add(r103);
        rooms.add(r104);

        //iterate through our collection and tell us information about the room
        for(Room r : rooms){
            System.out.println(r);
        }


    }
}