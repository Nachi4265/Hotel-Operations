package com.pluralsight;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;


    public Employee(int employeeID, String name, String department, double payRate, int hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
//        if(hoursWorked<40){
//            return regularHours()*payRate;
//        }else {
//            return overTimeHours()*payRate;
//        }

        return (regularHours()*payRate)+ (overTimeHours()*1.5*payRate);
    }

    public double regularHours(){
        return (hoursWorked> 40) ? 40 : hoursWorked;
    }

    public double overTimeHours(){
        return (hoursWorked>40) ? hoursWorked - 40 : 0;
    }









//    private LocalDateTime dateTimePunchInTime = LocalDateTime.now();
//
//    public LocalDateTime punchIn(){
//        LocalDateTime inTime  = dateTimePunchInTime;
//        return inTime;
//    }
//
//    public void punchOut(){
//        LocalDateTime outTime = LocalDateTime.now();
//
//        Duration timePassed = Duration.between(punchIn(),outTime);
//       String time = timePassed.toString();
//        this.hoursWorked += Integer.parseInt(time);
//        //Punch in time and punch out time difference
//    }


    public void punchIn(){
        LocalTime localTime = LocalTime.now();
        this.punchInTime = localTime.getHour() + ((double)localTime.getMinute() / 60);

    }
    public void punchOut(){
        LocalTime localTime = LocalTime.now();
        double punchOutAsDouble = localTime.getHour() + ((double)localTime.getMinute() / 60);
        this.hoursWorked += (float) (punchOutAsDouble-this.punchInTime);

    }





    private double punchInTime = 0;

    public void punchIn(double time){
        this.punchInTime = time;
    }

    public void punchOut(double time){
        double elapsedTime = time - this.punchInTime;
        this.hoursWorked += elapsedTime;

        this.hoursWorked += (float)(time - this.punchInTime);
    }

    public void punchTimeCard(double checkIn , double checkOut){
        this.hoursWorked += (float)(checkIn-checkOut);
    }




    public void logHours(float hours){
        this.hoursWorked += hours;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                ",getTotalPay()=" + getTotalPay()+
                ",getRegularHours()=" + regularHours()+


                '}';
    }
}
