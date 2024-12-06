package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet(name = "Servlet07", value = "/Servlet07")
public class Servlet07 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset =utf-8");
        ServletContext context =this.getServletContext();
        PrintWriter out =response.getWriter();
        InputStream in =context.getResourceAsStream("/WEB-INF/itcast.properties");
        Properties pros =new Properties();
        pros.load(in);
        out.println("Company="+pros.getProperty("Company")+"<br />");
        out.println("Address="+pros.getProperty("Address")+"<br />");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
