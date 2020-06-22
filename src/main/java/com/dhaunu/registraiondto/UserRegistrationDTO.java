package com.dhaunu.registraiondto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRegistrationDTO {

	@NotBlank(message = "*UserName can't be blank")
	@Size(min = 5, max = 15, message = "*UserName should be 5 to 15 charecters")
	private String userName;
	
	@NotBlank(message = "*Password can't be blank")
	@Size(min = 5, max = 15, message = "*Password should be atleast one special charecters")
	private String password;

	public UserRegistrationDTO() {
		System.out.println("Login constr method has been called");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegistrationDTO [userName=" + userName + ", password=" + password + "]";
	}

}
