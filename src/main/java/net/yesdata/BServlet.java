package net.yesdata;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebServlet(asyncSupported = false, urlPatterns = "/b")
public class BServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(((HttpServletRequest)servletRequest).getRequestURI());
        System.out.println("===== B servlet =====" + Thread.currentThread().getName());
        servletResponse.getWriter().println("B Servlet");
        servletResponse.flushBuffer();
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
