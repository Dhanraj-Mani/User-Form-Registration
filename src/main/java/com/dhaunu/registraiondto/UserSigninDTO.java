package com.dhaunu.registraiondto;

import java.util.Arrays;

import javax.validation.constraints.NotEmpty;

import com.dhanu.registration.annotations.Age;

public class UserSigninDTO {

	@NotEmpty(message = "* name cannot be empty")
	private String name;
	
	private String username;
	private char[] password;
	private String hobbies;
	private String country;
	private String gender;
	
	@Age(lower = 30, upper = 60, message = "Age should between 30 to 60")
	private Integer age;
	
	private UserCommunicationDTO userCommunicationDTO;

	public UserSigninDTO() {
		System.out.println("Registration constr has been called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public UserCommunicationDTO getUserCommunicationDTO() {
		return userCommunicationDTO;
	}

	public void setUserCommunicationDTO(UserCommunicationDTO userCommunicationDTO) {
		this.userCommunicationDTO = userCommunicationDTO;
	}

	@Override
	public String toString() {
		return "UserSigninDTO [name=" + name + ", username=" + username + ", password=" + Arrays.toString(password)
				+ ", hobbies=" + hobbies + ", country=" + country + ", gender=" + gender + ", age=" + age
				+ ", userCommunicationDTO=" + userCommunicationDTO + "]";
	}

}
