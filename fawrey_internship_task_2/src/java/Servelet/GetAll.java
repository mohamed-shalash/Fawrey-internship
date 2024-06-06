/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servelet;

import Classes.Product;
import Classes.ProductManeger;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mohamed shalash
 */
public class GetAll extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ProductManeger pm =ProductManeger.Getinstance();
        CopyOnWriteArrayList<Product> products = pm.GetAll();
        
        HttpSession s = request.getSession();
        s.setAttribute("list", products);
        
        response.sendRedirect("/product/Getall.jsp");
        
    }

}
