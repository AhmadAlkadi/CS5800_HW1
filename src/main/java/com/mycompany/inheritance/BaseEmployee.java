/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author PROXD
 */
public class BaseEmployee extends Employee{
    private int baseSalary;
    
    public BaseEmployee(){
        super();
        this.baseSalary = 0;
    }
    
    public BaseEmployee(String firstName,String lastName,String socialSecurityNumber,int baseSalary){
        super(firstName,lastName,socialSecurityNumber);
        this.baseSalary = baseSalary;
    }
    
    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }
    
    public int setBaseSalary(){
        return this.baseSalary;
    }
}
