/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid_gui;

/**
 *
 * @author ASUS
 */

public class Country_data {
    private String conutry;
    private int confirmed,active,deaths,recovered;
    public void setconfirmed(int confirmed) {
        this.confirmed = confirmed;
    }
    public void setactive(int active) {
        this.active = active;
    }
    
    public void setdeaths(int deaths) {
        this.deaths = deaths;
    }
    
    public void setrecovered(int recovered) {
        this.recovered = recovered;
    }
     public void setrecovered(String conutry) {
        this.conutry = conutry;
    }
    public int getrecovered() {
        return this.recovered;
    }
    public int getdeaths() {
        return this.deaths;
    }
 
    public int getactive() {
        return this.active;
    }
    public int getconfirmed() {
        return this.confirmed;
    }
    public String getconutry() {
        return this.conutry;
    }
    
    
}
