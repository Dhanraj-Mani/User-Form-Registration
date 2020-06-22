package com.dhanu.currency.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class CurrencyPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		System.out.println("My currency method has been called");
		Currency currency = Currency.getInstance(text.toUpperCase());
		setValue(currency);
	}
	
	

}
