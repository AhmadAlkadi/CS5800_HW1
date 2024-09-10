/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author PROXD
 */
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
