 package com.dhanu.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.dhaunu.registraiondto.UserPhoneDTO;

public class PhoneNumberFormatter implements Formatter<UserPhoneDTO>{

	public String print(UserPhoneDTO object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserPhoneDTO parse(String completePhoneNumber, Locale locale) throws ParseException {
		
		System.out.println("Pharse method of phonenumber formatter has been executed");
		UserPhoneDTO userPhoneDTO = new UserPhoneDTO();
		String[] phoneNumberArray = completePhoneNumber.split("-");
		
		int index = completePhoneNumber.indexOf("-");
		if(index == -1) {
			
			userPhoneDTO.setCountryCode("91");
			userPhoneDTO.setUserPhoneNumber(phoneNumberArray[0]);
		}
		
		else {
		userPhoneDTO.setCountryCode(phoneNumberArray[0]);
		userPhoneDTO.setUserPhoneNumber(phoneNumberArray[1]);
		
		}
		return userPhoneDTO;
	}

}
