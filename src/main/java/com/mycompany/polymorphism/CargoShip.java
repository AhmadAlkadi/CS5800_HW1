package com.mycompany.polymorphism;

public class CargoShip extends Ship{
    private int cargoCap;
    
    public CargoShip(){
        super();
        this.cargoCap = 0;
    }
    
    public CargoShip(String shipName, String shipYear, int cargoCap){
        super(shipName,shipYear);
        this.cargoCap = cargoCap;
    }
    
    public void setCargoCap(int cargoCap){
        this.cargoCap = cargoCap;
    }
    
    public int getCargoCap(){
        return this.cargoCap;
    }
    
    @Override
    public void printShip(){
        System.out.println("Ship name: "+ super.getShipName() +"| Ships cargo capacity: "+ cargoCap);
    }
}
