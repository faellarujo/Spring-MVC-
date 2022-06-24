package com.MVC;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
public class WebAppConfiguration extends WebMvcConfigurerAdapter {
	    
    public void defaultServletHandling(DefaultServletHandlerConfigurer configurer) {
         configurer.enable();
    }
    
}
