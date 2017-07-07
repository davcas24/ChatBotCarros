/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorbasededatos;

/**
 *
 * @author David Castro
 */
public class Cars {
    public String model;
    public int price;
    public String type;
    public int year;
    public String fueltype;
    public String gearbox;
    public int wheelsize;
    public double engine;

    public Cars(String model, int price, String type, int year, String fueltype, String gearbox, int wheelsize, double engine) {
        this.model = model;
        this.price = price;
        this.type = type;
        this.year = year;
        this.fueltype = fueltype;
        this.gearbox = gearbox;
        this.wheelsize = wheelsize;
        this.engine = engine;
    }

    public Cars() {
    }
        
    
    @Override
    public String toString() {
        return "Cars{" + "model=" + model + ", price=" + price + ", type=" + type + ", year=" + year + ", fueltype=" + fueltype + ", gearbox=" + gearbox + ", wheelsize=" + wheelsize + ", engine=" + engine + '}';
    }
    
    
    
}
