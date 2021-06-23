/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taila.dao;

/**
 *
 * @author Admin
 */
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
public class CurrentDate {
    public static LocalDateTime getDate() {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();
   return now;
}  
}
