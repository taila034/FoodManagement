/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taila.dto;

/**
 *
 * @author Admin
 */
public class FoodError {
     private String IDError;
    
    public FoodError() {
    }

    public FoodError(String IDError) {
        this.IDError = IDError;
       
    }

    public void setIDError(String IDError) {
        this.IDError = IDError;
    }

    public String getIDError() {
        return IDError;
    }

}
