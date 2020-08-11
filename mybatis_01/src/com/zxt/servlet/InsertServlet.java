package com.zxt.servlet;

import com.zxt.service.PeopleService;
import com.zxt.serviceimpl.PeopleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
    private PeopleService peopleService = new PeopleServiceImpl();

    public InsertServlet() throws IOException {
    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int count = peopleService.ins();
//        req.setAttribute("count", count);
////        req.getRequestDispatcher("index.jsp").forward(req, resp);
//    }
}
