package com.zxt.servlet;

import com.zxt.po.People;
import com.zxt.service.PeopleService;
import com.zxt.serviceimpl.PeopleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//大部分注解都有默认属性，如果直接只给默认属性赋值，可以省略大属性名
//否则在注解的（属性名=属性值）格式
//如果一个属性是数组类型格式：属性名={值，值}，如果该数组只有一个值，可以省略大括号
//如果类不是基本属性类型或String而是一个类类型，语法：属性名=@类型
//注解中@表示引用注解说明
@WebServlet("/show")
public class ShowServlet extends HttpServlet {
    private PeopleService peopleService = new PeopleServiceImpl();

    public ShowServlet() throws IOException {
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<People> list = peopleService.show();
        req.setAttribute("list", list);
        //相对路径
        //只要路径中以/开头都叫全限定路径，从项目根目录（WebContent）出发找到其他资源的过程
        //之要不以 / 开头都是相对路径是从当前资源出发找到其他资源的过程
        //如果请求转发 / 表示 WebContent目录
        //如果是重定向，静态资源引用，必须<img src="" />  <a href=""/>  <script src=""/> 其中/都表示的是tomcat的Webapps文件夹根目录
        //服务器根目录
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}