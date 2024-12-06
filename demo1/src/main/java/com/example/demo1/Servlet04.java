package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "Servlet04", value = "/Servlet04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/ntml;charset=utf-8");
        PrintWriter out = response.getWriter();
        ServletContext context =this.getServletContext();
        Enumeration<String> paramNames = context.getInitParameterNames();
        out.println("all the paramName and paramValue are following:");
        while(paramNames.hasMoreElements()){
            String name =paramNames.nextElement();
            String value =context.getInitParameter(name);
            out.println(name+":"+value);
            out.println("<br />");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
