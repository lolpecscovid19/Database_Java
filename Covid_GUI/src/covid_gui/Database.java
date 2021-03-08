/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package covid_gui;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Database {
     final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
     final String DB_URL = " lol-covid.casztia4yly0.eu-central-1.rds.amazonaws.com";
     final String USER = "xaingAde";
     final String PASS = "xaingAde12345";
     
     public void connct(){// connect the cloud mysql 

         
     }
     public void store_data_to_database(String country,int confirmed,int active,int deaths,int recovered,String tablename){
         
     }
     public ArrayList<String> get_all_country_from_database(){
    ArrayList<String> countries = new ArrayList<String>();
    
    
    
         return countries;
}
     public int get_confirmed_from_database_by_country(String country){
         int confirmed = 0;
         return confirmed;
     }
     
     public int get_active_from_database_by_country(String country){
         
         int active = 0;
         return active;
     }
   
     public int get_deaths_from_database_by_country(String country){
      int deaths = 0;
         return deaths;   
     }
     
     public int get_recovered_from_database_by_country(String country){
         int recovered = 0;
         return recovered;
     }
    

}
        

