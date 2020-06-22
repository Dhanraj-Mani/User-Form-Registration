package com.dhanu.registration.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{

	private int lower;
	private int upper;
	
	public void initialize(Age age) {
		
		this.lower = age.lower();
		this.upper = age.upper();
		System.out.println("Annotation constr method has been called");
	}
	
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		
		if(age == null) {
			return false;
		}
		if(age < lower || age > upper) {
			
			return false;
		}
		return true;
	}

}
