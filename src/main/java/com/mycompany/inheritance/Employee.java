package com.mycompany.inheritance;


public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee(){
        this.firstName = null;
        this.lastName = null;
        this.socialSecurityNumber = null;
    }
    
    public Employee(String firstName,String lastName,String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setSSN(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getSSN(){
        return this.socialSecurityNumber;
    }
}
