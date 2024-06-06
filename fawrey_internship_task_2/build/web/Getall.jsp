<%-- 
    Document   : Getall
    Created on : Jun 6, 2024, 7:37:07 AM
    Author     : mohamed shalash
--%>

<%@page import="java.util.concurrent.CopyOnWriteArrayList"%>
<%@page import="Classes.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALL</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <div class="container">
            <% CopyOnWriteArrayList<Product> products = (CopyOnWriteArrayList<Product>) session.getAttribute("list");
            for (int i = 0; i < products.size(); i++) {%>
            <ul id="">
                <li><%= products.get(i).getId()%> : 
                    <%= products.get(i).getName()%> :
                    <%= products.get(i).getDescription()%> :
                    <%= products.get(i).getPrice()%> $
                    :<%= products.get(i).getQuntity()%>
                </li>
            </ul>
            <% }%>

            <button id="add-product" onclick="Back()">Back</button>
        </div>
        <script>
            window.Back = function () {
                window.location.href = 'index.jsp';
            }
        </script>
    </body>
</html>
