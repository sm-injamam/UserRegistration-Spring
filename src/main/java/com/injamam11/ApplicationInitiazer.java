package com.injamam11;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitiazer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// ------------------ region RootContext creation and registration ----------------------
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(RootConfig.class);//RootConfig concern with all other beans except views(pages) and view related beans(controller).
		rootContext.refresh();
		
		servletContext.addListener(new ContextLoaderListener(rootContext));
	    // ------------------- endregion RootContext creation and registration ----------------------
		
		// ------------------ region ServletContext creation and registration ----------------------
		AnnotationConfigWebApplicationContext servletRegisterer = new AnnotationConfigWebApplicationContext();
		servletRegisterer.register(WebMvcConfig.class); //WebMvcConfig concern with views(pages) and view related beans(controller).
		ServletRegistration.Dynamic registration = servletContext.addServlet("servlet", 
				new DispatcherServlet(servletRegisterer));
		
		// ------------------ endregion ServletContext creation and registration ----------------------
		
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
		
		
		
	}
}
