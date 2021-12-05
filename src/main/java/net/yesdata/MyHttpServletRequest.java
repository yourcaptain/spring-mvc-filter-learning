package net.yesdata;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyHttpServletRequest extends HttpServletRequestWrapper {
    public MyHttpServletRequest(HttpServletRequest request) {
        super(request);
    }

    public String getRemoteUser(){
        return "WrappedUser";
    }

    public String getContextPath(){
        return "/";
    }

    public String getPathInfo(){
        return "/c";
    }

    public String getRequestURI(){
        return "/c";
    }
}
