package com.yangjchang.a_original.servlet;

import com.yangjchang.a_original.service.DemoService;
import com.yangjchang.a_original.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 杨佳畅
 * @Description:
 */
@WebServlet(urlPatterns = "/demo1")
public class DemoServlet1 extends HttpServlet {

    private DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print(demoService.findAll().toString());
    }
}
