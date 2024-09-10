package com.mycompany.inheritance;


public class SalariedEmployee extends Employee{
    private int weeklySalary;
    
    public SalariedEmployee(){
        this.weeklySalary = 0;
    }
    
    public SalariedEmployee(String firstName,String lastName,String socialSecurityNumber, int weeklySalary){
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
    
    public void setWeeklySalary(int weeklySalary){
        this.weeklySalary = weeklySalary;
    }
    
    public int getWeeklySalary(){
        return this.weeklySalary;
    }
}
