package com.mycompany.polymorphism;

public class ShipMain {

    public static void main(String[] args) {
        Ship[] ship = new Ship[3];
        
        ship[0] = new Ship("SF Ammonia", "1929");
        ship[1] = new CruiseShip("AIDAblu", "2010", 71304);
        ship[2] = new CargoShip("Banglar Samriddhi", "2018", 38894);
        
        for(int i =0; i<ship.length;i++){
            ship[i].printShip();
        }
    }
    
}
