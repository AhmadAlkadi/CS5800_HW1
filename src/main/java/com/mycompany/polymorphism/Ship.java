package com.mycompany.polymorphism;

public class Ship {
    private String shipName, shipYear;
    
    public Ship(){
        shipName = null;
        shipYear = null;
    }
    
    public Ship(String shipName, String shipYear){
        this.shipName = shipName;
        this.shipYear = shipYear;
    }
    
    public void setShipName(String shipName){
        this.shipName = shipName;
    }
    
    public void setShipYear(String shipYear){
        this.shipYear = shipYear;
    }
    
    public String getShipName(){
        return this.shipName;
    }
    
    public String getShipYear(){
        return this.shipYear;
    }
    
    public void printShip(){
        System.out.println("Ship name: "+ shipName +"| Ship Year: "+ shipYear);
    }
}
