package net.yesdata;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class SpringConfig implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        DelegatingFilterProxy proxy = new DelegatingFilterProxy();
        proxy.setTargetBeanName("myFilter");
        FilterRegistration.Dynamic filterProxy = servletContext.addFilter(
                "delegatingFilterProxy", proxy);
        filterProxy.addMappingForUrlPatterns(null, true,"/*");

    }
}
