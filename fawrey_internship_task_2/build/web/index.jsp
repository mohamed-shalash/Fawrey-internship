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
        <h1>Product List</h1>
        <%! ProductManeger pm =ProductManeger.Getinstance(); %>
           
            
            <% 
        CopyOnWriteArrayList<Product> products =pm.GetAll();
        System.out.println(""+products.size());
        for (int i = 0; i < products.size(); i++) { %>
        <ul id="">
            <li><%= products.get(i).getId() %> : 
                <%= products.get(i).getName()%> :
                <%= products.get(i).getDescription()%> :
                <%= products.get(i).getPrice()%> $
                :<%= products.get(i).getQuntity()%>
            <div>
                <button class="update" onclick="updateProduct(<%= products.get(i).getId() %>)">Update</button>
                <button class="delete" onclick="deleteProduct(<%= products.get(i).getId() %>)">Delete</button>
             </div></li>
        </ul>
             <% } %>
        <button id="add-product" onclick="addProduct()">Add Product</button>
    </div>

             <script>
                    window.addProduct = function() {
                        <%! int id =5;%>
                        //alert(<%= id %>); 
                        <% //response.sendRedirect("welcome.html");value="<%= session.getAttribute("id") %>
                        window.location.href = 'add.jsp';
                        //window.location.assign('https://www.example.com');
                        //window.location.replace('https://www.example.com');

                        
                    }
                    window.updateProduct = function(id) {
                        window.location.href = 'update.jsp?id='+id; 
                    }

                    window.deleteProduct = function(id) {
                       window.location.href = 'delete.jsp?id='+id;                               
                    }

             </script>
    </body>
</html>
