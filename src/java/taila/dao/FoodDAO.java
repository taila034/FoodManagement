/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taila.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import taila.dto.FoodDTO;
import taila.utils.DBUtils;

/**
 *
 * @author Admin
 */
public class FoodDAO {
    public boolean checkDuplicate(String id) throws SQLException{
        boolean check=false;
        Connection conn= null;
        PreparedStatement stm= null;
        ResultSet rs=null;
        try{
            conn=DBUtils.getConnection();
            if(conn!=null){
            String sql="SELECT id "
                    + " FROM Foods"
                    +" WHERE id=?";
           stm=conn.prepareStatement(sql);
           stm.setString(1, id);
           rs=stm.executeQuery();
           if(rs.next()){
               check=true;
           }
      }  
      }catch(Exception e) {
            
        }finally{
            if(rs!=null) rs.close();
            if(stm!=null) stm.close();
            if(conn!=null) conn.close();
            }
        return check;
        }
    public static void insert(FoodDTO user) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        PreparedStatement stm=null;
        try{
            conn=DBUtils.getConnection();
            if(conn!=null){
                String sql= "INSERT INTO Foods(id, name, description, price, cookingTime, status, createDate) VALUES(?,?,?,?,?,?,?)";
                stm=conn.prepareStatement(sql);
                stm.setString(1, user.getId());
                stm.setString(2, user.getName());
                stm.setString(3, user.getDescription());
                stm.setString(4, user.getPrice());
                stm.setString(5, user.getCookingTime());
                stm.setString(6, user.getStatus());
                stm.setString(7, user.getCreateDate());        
                stm.executeUpdate();
            }
            
            
    }catch(Exception e){
        e.printStackTrace();
    }finally{
            if(stm!=null) stm.close();
            if(conn!=null) conn.close();
        }
    }
 public static List<FoodDTO> getFoodList(String search) throws  SQLException   
 {
   List<FoodDTO> list= new ArrayList<>();
   Connection conn=null;
   PreparedStatement stm=null;
   ResultSet rs=null;
   try{
       conn= DBUtils.getConnection();
       if(conn!=null){
           String sql="SELECT name, description, price, cookingTime, createDate "
                   + " FROM Foods "
                   +" WHERE name LIKE ?";
           stm= conn.prepareStatement(sql);
           stm.setString(1, "%"+search+"%");

           rs= stm.executeQuery();
           while (rs.next()){

               list.add(new FoodDTO(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
               
           }
       }
   }catch(Exception e){
       
   }finally{
       if (rs!=null) rs.close();
       if (stm!=null) stm.close();
       if(conn!=null) conn.close();
       
   }
return list;
}
public void delete(String id) throws SQLException{
    Connection conn= null;
    PreparedStatement stm=null;
    try{
        conn= DBUtils.getConnection();
        if(conn!=null){
            String sql="UPDATE Foods SET status= 0 "
                    + " WHERE id=?";
            stm= conn.prepareStatement(sql);
            
            stm.setString(1, id);
            stm.executeUpdate();
            
        }
    }catch(Exception e){}
    finally{
        if(stm!=null) stm.close();
        if(conn!=null) conn.close();
    }
}
    
       
    
}
