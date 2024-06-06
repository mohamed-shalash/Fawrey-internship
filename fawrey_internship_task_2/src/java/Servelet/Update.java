/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servelet;

import Classes.Product;
import Classes.ProductManeger;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mohamed shalash
 */
public class Update extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         ProductManeger pm=ProductManeger.Getinstance();
        int Id = Integer.parseInt(request.getParameter("id"));
            String Name = (String) request.getParameter("name");
            String description = (String) request.getParameter("description");
            int Price =Integer.parseInt( request.getParameter("price"));
            int Quntity =Integer.parseInt( request.getParameter("Quntity"));
            pm.update(new Product(Id, Name, description, Quntity, Price));
            
            response.sendRedirect("index.jsp");
    }

}
