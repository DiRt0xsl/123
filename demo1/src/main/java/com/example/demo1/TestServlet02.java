package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestServlet02", value = "/TestServlet02")
public class TestServlet02 extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init is called");
    }
    public void service(ServletRequest request,ServletResponse response)throws ServletException{
        System.out.println("");
    }
    public void destroy(){
        System.out.println("destroy method is called");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
