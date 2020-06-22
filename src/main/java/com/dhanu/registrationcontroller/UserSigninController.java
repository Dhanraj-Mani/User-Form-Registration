 package com.dhanu.registrationcontroller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhanu.name.propertyeditor.NamePropertyEditor;
import com.dhaunu.registraiondto.UserSigninDTO;

@Controller
public class UserSigninController {
	
	@RequestMapping("/userSignin")
	public String userSignin(@ModelAttribute("userSign") UserSigninDTO userSigninDTO)
	{
		
		userSigninDTO.setName("Dhanraj");
		System.out.println("Signin-page has been called");
		
		return "user-signin-page";
	}

	@RequestMapping("/userSigninSuccess")
	public String userSigninSuccess(@Valid @ModelAttribute("userSign") UserSigninDTO userSignindto, BindingResult results)
	{
		System.out.println("Name value entered by user is : " + "|" + userSignindto.getName() + "|");
		
		if(results.hasErrors())
		{
			System.out.println("My page has errors");
			
			return "user-signin-page";
		}
		System.out.println("Signin success page has been called");
		return "user-signinsuccess-page";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		System.out.println("Inside of the init binder method");
		
		StringTrimmerEditor editor = new StringTrimmerEditor(false);
		binder.registerCustomEditor(String.class, "name", editor);
		
		NamePropertyEditor nameEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "name", nameEditor);
		
	//	binder.setDisallowedFields("name");
		
	}
	
}
