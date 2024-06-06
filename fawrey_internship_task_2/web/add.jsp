<%-- 
    Document   : add
    Created on : Jun 3, 2024, 4:36:36 PM
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
        <form action="/product/add" >
                Id <input type="text" name="id" /> <br>
                Name <input type="text" name="name" /> <br>
                Description <input type="text" name="description" /> <br>
                Price <input type="text" name="price" /> <br>
                Quntity <input type="text" name="Quntity" /> <br>
            
                <input id="add-product" type="submit" value="OK"/>
            </form>
    </body>
</html>
