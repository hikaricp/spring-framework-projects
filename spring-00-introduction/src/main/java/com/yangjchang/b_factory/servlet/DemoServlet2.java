package com.yangjchang.b_factory.servlet;

import com.yangjchang.b_factory.service.DemoService;
import com.yangjchang.b_factory.service.impl.DemoServiceImpl;

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
@WebServlet(urlPatterns = "/demo2")
public class DemoServlet2 extends HttpServlet {

    private DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print(demoService.findAll().toString());
    }
}
