<%-- 
    Document   : createFood
    Created on : Mar 12, 2021, 9:16:25 PM
    Author     : Admin
--%>

<%@page import="taila.dao.CurrentDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new Food</title>
    </head>
    <body>

        <form action="MainController" method="POST">
        
            Food ID(F-XXX)<input type="text" name="id" value="" pattern="F-[0-9]{3}" required="true"></br>
            ${ERROR.IDError} </br>
            Name<input type="text" name="name" value="" required="true"></br>
            Description<input type="text" name="des" value="" required="true"></br>
            Price<input type="number" name="price" value="" step="0.01" required="true"></br>
            Cooking Time<input type="number" name="ckt" value="" pattern="\d*" required="true"> </br>
            <input type="hidden" name="status" value="true"></br>
            Create Date <input type="text" name="date" value="${CurrentDate.getDate()}" readonly></br>
            <input type="submit" name="action" value="Create">
            
        </form>
    
    </body>
</html>
