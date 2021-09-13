package com.injamam11;


//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//import com.injamam11.controllers.HelloService;

@EnableWebMvc
//@Configuration // we can define bean inside this class.
@ComponentScan(basePackages = {"com.injamam11.controllers"})
public class WebMvcConfig implements WebMvcConfigurer {
	
	public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }
	
//@Bean // copy it to TestConfig
//public HelloService helloService() {
//	return new HelloService();
//}
}
