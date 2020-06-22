package com.dhanu.creditcard.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.dhaunu.registraiondto.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard> {

	public String print(CreditCard object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	public CreditCard parse(String creditcardNumber, Locale locale) throws ParseException {
		//Setting the credit card values
		CreditCard creditCard = new CreditCard();
		
		//Splitting the credit card values
		String[] digitsArray = creditcardNumber.split("-");
		
		creditCard.setFirstFourDigits(Integer.valueOf(digitsArray[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(digitsArray[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(digitsArray[2]));
		creditCard.setLastFourDigits(Integer.valueOf(digitsArray[3]));
		
		
		return creditCard;
	}

}
