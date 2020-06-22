package com.dhanu.name.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String myConvertedValue = text.toUpperCase();
		setValue(myConvertedValue);
	}
	
	

}
