package com.crazyvaper.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebAppConfig.class, SpringConfig.class, JpaConfig.class);
        context.setServletContext(servletContext);

        ServletRegistration.Dynamic dispather = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        dispather.setLoadOnStartup(1);
        dispather.addMapping("/");

    }
}
