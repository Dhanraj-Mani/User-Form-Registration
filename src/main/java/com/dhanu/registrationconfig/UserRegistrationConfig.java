package com.dhanu.registrationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.dhanu.creditcard.formatter.CreditCardFormatter;
import com.dhanu.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.dhanu.registrationcontroller")
public class UserRegistrationConfig implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		System.out.println("Config method is called");
		
		return viewResolver;
	}
	
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("config addformatters method is called");
		registry.addFormatter(new PhoneNumberFormatter());
	}
	
	/*public void addFormatters1(FormatterRegistry reg) {
		System.out.println("Credit card addformatters method is called");
		reg.addFormatter(new CreditCardFormatter());
	}
*/
}
