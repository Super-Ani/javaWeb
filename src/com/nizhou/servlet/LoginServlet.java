package com.nizhou.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    //选择调用get post请求
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //登陆功能的实现
        resp.setContentType("Text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        if(req.getParameter("username").equals("nizhou")&&req.getParameter("password").equals("123456")){

            out.println("<h1><font color ='green'>登录成功！</h1>");
            System.out.println("登录成功！");
        }else{
            out.println("<h1><font color ='red'>登录失败！</h1>");
            System.out.println("登录失败！");
        }

    }
}
