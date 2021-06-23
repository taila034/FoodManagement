<%-- 
    Document   : search
    Created on : Mar 12, 2021, 9:06:30 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Search Food</title>
    </head>
    <body>
        <h1>Welcome Admin</h1>
        <form action="MainController">
            Search<input type="text" name="txtsearch" value="${param.txtsearch}"/>
            <input type="submit" name="action" value="SearchFood"/>
        </form>
    <c:if test="${requestScope.LIST_FOOD !=null}">
        <table border="1">
            <thead>
                <tr>
                  
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Cooking Time</th>
                    <th>Create Date</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dto" items="${requestScope.LIST_FOOD}" varStatus="counter">
                <tr>

                            <td>
                                <input type="text" name="name" value="${dto.name}" />
                            </td>
                            <td>
                                <input type="text" name="price" value="${dto.price}" />
                            </td>
                            <td>
                                <input type="text" name="cookingTime" value="${dto.cookingTime}" readonly="true" />
                            </td>
                            <td>
                                <input type="text" name="description" value="${dto.description}" />
                            </td>
                            <td>
                                <input type="text" name="createDate" value="${dto.createDate}" />
                            </td>
                    <td>
                     <c:url var="delete" value="MainController">
                            <c:param name="action" value="Delete"></c:param>
                            <c:param name="id" value="${dto.id}"></c:param>
                            <c:param name="txtsearch" value="${param.txtsearch}"></c:param>
                                
                        </c:url>
                        <a href="${delete}">Delete</a>
                    </td>
                      
                </tr>
                </c:forEach>
            </tbody>
        </table>

    </c:if>
    </body>
</html>
