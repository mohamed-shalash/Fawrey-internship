<%-- 
    Document   : Test1
    Created on : Jun 3, 2024, 10:43:13 AM
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
        <h1>Hello World!</h1>
        <%! int x=0;%>
        <% x++;%>
        <%  
        
            session.setAttribute("", "");

        %>
        <%= x%>
    </body>
</html>
