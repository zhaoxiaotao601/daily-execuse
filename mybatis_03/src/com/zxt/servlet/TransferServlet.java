package com.zxt.servlet;

import com.zxt.pojo.Account;
import com.zxt.service.AccountService;
import com.zxt.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/transfer")
public class TransferServlet extends HttpServlet {
    private AccountService accService = new AccountServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Account accOut = new Account();
        accOut.setAccno(req.getParameter("accOutNo"));
        accOut.setPassword(Integer.parseInt(req.getParameter("accOutPassword")));
        accOut.setBalance(Double.parseDouble(req.getParameter("accOutBalance")));
        Account accIn = new Account();
        accIn.setAccno(req.getParameter("accInAccNo"));
        accIn.setName(req.getParameter("accInName"));
        int index = accService.transfer(accIn, accOut);
        if (index == AccountService.SUCCESS) {
            resp.sendRedirect("/mybatis_03_war_exploded/log.jsp");
        } else {
            HttpSession session = req.getSession();
            session.setAttribute("code", index);
            resp.sendRedirect("/mybatis_03_war_exploded/error/error.jsp");
        }

    }
}
