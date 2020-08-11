package com.zxt.servlet;

import com.zxt.service.AirportService;
import com.zxt.service.impl.AirportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showTake")
public class ShowTakeServlet extends HttpServlet {
    private AirportService airService = new AirportServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("takeport", airService.showTakePort());
        req.getRequestDispatcher("showLand").forward(req, resp);

    }
}
