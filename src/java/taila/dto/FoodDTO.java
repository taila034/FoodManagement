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
public class FoodDTO {
     private String id;
    private String name;
    private String description;
    private String price;
    private String cookingTime;
    private String status;
    private String createDate;

    public FoodDTO() {
    }

    public FoodDTO(String id, String name, String description, String price, String cookingTime, String status, String createDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.cookingTime = cookingTime;
        this.status = status;
        this.createDate = createDate;
    }

    public FoodDTO(String name, String description, String price, String cookingTime, String createDate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.cookingTime = cookingTime;
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public String getStatus() {
        return status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    
}
