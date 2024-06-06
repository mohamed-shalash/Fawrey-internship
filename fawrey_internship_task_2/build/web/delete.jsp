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
        <form action="/product/delete" method="post">
            
            <input type="text" name="id" /> <br>
            <input id="add-product" type="submit" value="Yes"/>
        </form>
            <button class="delete" onclick="window.location.href = 'index.jsp'">No</button>
    </body>
</html>
