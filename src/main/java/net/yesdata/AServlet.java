package net.yesdata;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(asyncSupported = true, urlPatterns = "/a")
public class AServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        servletRequest.getRequestDispatcher("/b").forward(servletRequest, servletResponse);

        MyHttpServletRequest myHttpServletRequest = new MyHttpServletRequest((HttpServletRequest)servletRequest);
        AsyncContext asyncContext = servletRequest.startAsync(myHttpServletRequest, servletResponse);
//        AsyncContext asyncContext = servletRequest.startAsync();
        asyncContext.dispatch("/c");
        System.out.println("===== A servlet =====" + Thread.currentThread().getName());
        servletResponse.getWriter().println("A Servlet");
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
