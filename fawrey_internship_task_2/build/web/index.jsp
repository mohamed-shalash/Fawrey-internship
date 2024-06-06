<%-- 
    Document   : index
    Created on : Jun 3, 2024, 12:36:37 PM
    Author     : mohamed shalash
--%>
<%@page import="java.util.concurrent.CopyOnWriteArrayList"%>
<%@ page import="Classes.ProductManeger" %>
<%@ page import="Classes.Product" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
    <div class="container">
            <div>
                <button id="add-product" onclick="addProduct()">Add Product</button>
                <button id="add-product" onclick="GetAll()">Get Products</button>
                <button class="update" onclick="updateProduct()">Update</button>
                <button class="delete" onclick="deleteProduct()">Delete</button>
             </div>
        </ul>
             
        
    </div>

             <script>
                    window.addProduct = function() {
                        <% //response.sendRedirect("welcome.html");value="<%= session.getAttribute("id") %>
                        window.location.href = '/product/add.jsp';
                        //window.location.assign('https://www.example.com');
                        //window.location.replace('https://www.example.com');

                        
                    }
                    window.GetAll = function() {
                        window.location.href = '/product/getall';
                    }
                    
                    window.updateProduct = function() {
                        window.location.href = '/product/update.jsp';
                    }

                    window.deleteProduct = function() {
                       window.location.href = '/product/delete.jsp';                          
                    }

             </script>
    </body>
</html>
