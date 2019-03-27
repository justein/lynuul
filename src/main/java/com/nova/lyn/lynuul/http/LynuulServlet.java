package com.nova.lyn.lynuul.http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName LynuulServlet
 * @Description TODO
 * @Author Lyn
 * @Date 2019/3/27 0027 下午 3:57
 * @Version 1.0
 */
@WebServlet(name = "lynuul", urlPatterns = "/*")
public class LynuulServlet extends HttpServlet {

    /**/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
