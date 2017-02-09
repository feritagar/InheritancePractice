/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author FA
 */
public class MusicalInstrument {
    //properties
    private String brand;
    private double price;

    
    //playInstrument method
    public void cleanUpInstrument(){
        System.out.println("You cleaned up your instrument!!");
    }
    
    // getter-setter methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
    
    
    
    
}
