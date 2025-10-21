package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //making collection of rooms
        ArrayList<Room>rooms = new ArrayList<>();

        //rooms with number of beds (rooms are new)
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
        System.out.println();


        //Guest checked into rooms
        r101.checkIn();
        r102.checkIn();

        //Show rooms again
        for(Room r : rooms){
            System.out.println(r);
        }
        System.out.println();


        //Only room 101 is checked out and cleaned
        r101.checkOut();
        r101.cleanRoom();

        for(Room r : rooms){
            System.out.println(r);
        }
        System.out.println();
//------------------------------------------------------------------------------------------------------------------------------//



        //RESERVATIONS

        ArrayList<Reservation>reservations = new ArrayList<>();

        Reservation res1 = new Reservation("King", 2,true);
        Reservation res2 = new Reservation("double", 2,false);
        Reservation res3 = new Reservation("King", 1,true);
        Reservation res4 = new Reservation("King", 4,false);

        reservations.add(res2);
        reservations.add(res3);
        reservations.add(res4);
        reservations.add(res1);

        for(Reservation r : reservations){
            System.out.println(r);
        }

        System.out.println();

//-------------------------------------------------------------------------------------------------------------------------------------//

        //EMPLOYEES

        ArrayList<Employee>employees = new ArrayList<>();

        Employee emp1 = new Employee(1,"Nachi","Chef",10.00,0);
        Employee emp2 = new Employee(2,"Nisa","Manager",70.00,60);
        Employee emp3 = new Employee(3,"Jaylen","HouseKeeping",20.00,30);
        Employee emp4 = new Employee(4,"Nate","President",100.00,1);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);


        for(Employee e : employees){
            System.out.println(e);
        }
        System.out.println();



        //Nachi punches in and works some hours

        emp1.punchIn(8);
        emp1.punchOut(12);

        emp1.punchIn(13);
        emp1.punchOut(16);


//        emp2.punchTimeCard(6,12); //Worked 6 hours

        System.out.println("Nacho works some hours ");
        for(Employee e : employees){
            System.out.println(e);
        }

        emp4.punchIn();
        emp4.punchOut();
        System.out.println();
//-------------------------------------------------------------------------------------------------------------------------------------------------//

        //HOTEL

        ArrayList<Hotel>Hotels = new ArrayList<>();

        Hotel H1 = new Hotel("Marriot", 10, 10,5,10);
        Hotel H2 = new Hotel("Hilton", 10, 10,1,5);

        System.out.println(H1);
        System.out.println(H2);

        System.out.println("book room");
        System.out.println(H1.bookedRoom(2,true));
        System.out.println(H1);

























    }
}