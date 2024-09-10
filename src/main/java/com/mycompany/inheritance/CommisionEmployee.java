package com.mycompany.inheritance;


public class CommisionEmployee extends Employee{
    private int comRate, grossSales;
    
    public CommisionEmployee(){
        super();
        this.comRate = 0;
        this.grossSales = 0;
    }
    
    public CommisionEmployee(String firstName,String lastName,String socialSecurityNumber, int comRate, int grossSales){
        super(firstName,lastName,socialSecurityNumber);
        this.comRate = comRate;
        this.grossSales = grossSales;
    }
    
    public void setComRate(int comRate){
        this.comRate = comRate;
    }
    
    public void setGrossSales(int grossSales){
        this.grossSales = grossSales;
    }
    
    public int getComRate(){
        return this.comRate;
    }
    
    public int getGrossSales(){
        return this.grossSales;
    }
}
