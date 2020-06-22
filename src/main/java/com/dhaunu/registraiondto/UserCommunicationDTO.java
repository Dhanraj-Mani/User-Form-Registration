package com.dhaunu.registraiondto;

public class UserCommunicationDTO {

	private String email;
	private UserPhoneDTO phone;

	public UserCommunicationDTO() {
		System.out.println("UserCommunication constr has been called");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserPhoneDTO getPhone() {
		return phone;
	}

	public void setPhone(UserPhoneDTO phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserCommunicationDTO [email=" + email + ", phone=" + phone + "]";
	}

}
