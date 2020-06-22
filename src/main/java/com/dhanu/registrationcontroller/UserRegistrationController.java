package com.dhanu.registrationcontroller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhaunu.registraiondto.UserRegistrationDTO;

@Controller
public class UserRegistrationController {

	@RequestMapping("/login")
	public String userRegistration()
	{
		System.out.println("Login-page has been called");
		return "login-page";
	}
	
	@RequestMapping("/loginsuccess")
	public String loginSuccess(@Valid @ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO, BindingResult result)
	{
	
			if(result.hasErrors())
			{
				System.out.println("My form has error");
				return "login-page";
			}
			
		System.out.println("Login-success-page has been called");
		return "login-success-page";
	}
}
