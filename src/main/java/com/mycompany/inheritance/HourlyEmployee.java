package com.mycompany.inheritance;


public class HourlyEmployee extends Employee{
    private int wage, numHoursWorked;
    
    public HourlyEmployee(){
        super();
        this.wage = 0;
        this.numHoursWorked = 0;
    } 
    
    public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber, int wage, int numHoursWorked){
        super(firstName,lastName,socialSecurityNumber);
        this.wage = wage;
        this.numHoursWorked = numHoursWorked;
    } 
    
    public void setWage(int wage){
        this.wage = wage;
    }
    
    public void setNumHoursWorked(int numHoursWorked){
        this.numHoursWorked = numHoursWorked;
    }
    
    public int getWage(){
        return this.wage;
    }
    
    public int getNumHoursWorked(){
        return this.numHoursWorked;
    }
}
