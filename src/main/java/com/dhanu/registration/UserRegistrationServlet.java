package com.dhanu.registration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.dhanu.registrationconfig.UserRegistrationConfig;
import com.dhanu.registrationcontroller.UserRegistrationController;

public class UserRegistrationServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] array = {UserRegistrationConfig.class};
		return array;
	}

	@Override
	protected String[] getServletMappings() {
		String[] array = {"/"};
		return array;
	}

}
