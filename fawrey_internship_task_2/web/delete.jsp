<%-- 
    Document   : delete
    Created on : Jun 3, 2024, 5:18:06 PM
    Author     : mohamed shalash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/product/products" method="post">
            <% int id = Integer.parseInt(request.getParameter("id")); %>
            <h1>Are You shore You Want To Delete This Product</h1> <%= id %>
            
            <input type="text" name="id" value ="<%= id %>" hidden="true"/> <br>
            <input type="text" name="method" value ="delete" hidden="true"/> <br>
            <input id="add-product" type="submit" value="Yes"/>
        </form>
            <button class="delete" onclick="window.location.href = 'index.jsp'">No</button>
    </body>
</html>
