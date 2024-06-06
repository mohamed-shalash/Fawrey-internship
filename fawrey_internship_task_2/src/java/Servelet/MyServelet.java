/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servelet;

import Classes.Product;
import Classes.ProductManeger;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mohamed shalash
 */
public class MyServelet extends HttpServlet {
ProductManeger pm;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //String name = request.getParameter("name");
        String s =getServletConfig().getInitParameter("secret");
        String sh=getServletContext().getInitParameter("shared");
        
        int Id = Integer.parseInt(request.getParameter("id"));
        String Name = (String) request.getParameter("name");
        
        int Price =Integer.parseInt( request.getParameter("price"));
        int Quntity =Integer.parseInt( request.getParameter("Quntity"));
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServelet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyServelet at " + request.getContextPath() + "</h1>");
            out.println("<h1>Servlet name " + Id+Name + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        //response.sendRedirect("welcome.html");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //processRequest(request, response);
        int Id = Integer.parseInt(request.getParameter("id"));
        String Name = (String) request.getParameter("name");
        String description = (String) request.getParameter("description");
        int Price =Integer.parseInt( request.getParameter("price"));
        int Quntity =Integer.parseInt( request.getParameter("Quntity"));
        
        pm=ProductManeger.Getinstance();
        pm.add(new Product(Id,Name,description,Price,Quntity));
        
        response.sendRedirect("index.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         pm=ProductManeger.Getinstance();
        if(request.getParameter("method").equals("delete")){
            int id= Integer.parseInt((String) request.getParameter("id"));
            pm.delete(id);
        }else{
            int Id = Integer.parseInt(request.getParameter("id"));
            String Name = (String) request.getParameter("name");
            String description = (String) request.getParameter("description");
            int Price =Integer.parseInt( request.getParameter("price"));
            int Quntity =Integer.parseInt( request.getParameter("Quntity"));
            pm.update(new Product(Id, Name, description, Quntity, Price));
            
            
        }
        response.sendRedirect("index.jsp");
    }



    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
