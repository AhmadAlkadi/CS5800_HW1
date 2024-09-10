package com.mycompany.inheritance;


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
    
    public int getBaseSalary(){
        return this.baseSalary;
    }
}
