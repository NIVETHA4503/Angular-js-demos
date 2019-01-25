package com.spa.Configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppIntalizer extends AbstractAnnotationConfigDispatcherServletInitializer {
public WebAppIntalizer(){
	System.out.println("WebAppIntialaizer is loaded");
}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("In getRootConfigClasses method");
		return new Class[] {WebAppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("In getServletConfigClasses method");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("In getServletMappings method");
		return new String[] {"/"};
	}

}
