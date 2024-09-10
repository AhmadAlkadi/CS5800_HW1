package com.mycompany.polymorphism;

public class CruiseShip extends Ship{
    private int maxNumOfPass;
    
    public CruiseShip(){
        super();
        maxNumOfPass = 0;
    }
    
    public CruiseShip(String shipName, String shipYear, int maxNumOfPass){
        super(shipName, shipYear);
        this.maxNumOfPass = maxNumOfPass;
    }
    
    public void setMaxNumOfPass(int maxNumOfPass){
        this.maxNumOfPass = maxNumOfPass;
    }
    
    public int getMaxNumOfPass(){
        return this.maxNumOfPass;
    }
    
    @Override
    public void printShip(){
        System.out.println("Ship name: "+ super.getShipName() +"| Maximum number of passengers: "+ maxNumOfPass);
    }
}
