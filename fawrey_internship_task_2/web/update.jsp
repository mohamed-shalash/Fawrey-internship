<%-- 
    Document   : update
    Created on : Jun 3, 2024, 6:12:05 PM
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
                Id <input type="text" name="id" value ="<%= id %>" hidden="true"/> <%= id %> <br>
                Name <input type="text" name="name" /> <br>
                Description <input type="text" name="description" /> <br>
                Price <input type="text" name="price" /> <br>
                Quntity <input type="text" name="Quntity" /> <br>
                <input type="text" name="method" value ="post" hidden="true"/> <br>
                <input id="add-product" type="submit" value="OK"/>
        </form>
    </body>
</html>
