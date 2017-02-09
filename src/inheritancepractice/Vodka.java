/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

import java.util.ArrayList;

/**
 *
 * @author FA
 */
public class Vodka extends Drink {

    private String name;

    private String country;

    public void displayVodkaInformation() {
        System.out.println(name + " " + country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
