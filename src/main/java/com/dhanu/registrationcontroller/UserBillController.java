package com.dhanu.registrationcontroller;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhanu.creditcard.formatter.CreditCardFormatter;
import com.dhanu.currency.propertyeditor.CurrencyPropertyEditor;
import com.dhaunu.registraiondto.UserBillDTO;

@Controller
public class UserBillController {

	@RequestMapping("/payment")
	public String paymentPage(@ModelAttribute("userBill") UserBillDTO userBillDTO) {
		
		System.out.println("My payment page has been called");
		return "payment-page";
	}
	
	@RequestMapping("/paymentSuccess")
	public String paymentSuccess(@ModelAttribute("userBill") UserBillDTO UserBilldto,BindingResult result) {
		
		if(result.hasErrors()) {
			
			System.out.println("My payment page has error");
			return "payment-page";
		}
		System.out.println("My payement success page has been called");
		return "payment-success";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		//Register custom editor for date field
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor dateEditor = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, "date", dateEditor);
		
		//Register custom editor for number field
		NumberFormat numberFormat = new DecimalFormat("##,###,00");
		CustomNumberEditor numberEditor = new CustomNumberEditor(BigDecimal.class,numberFormat, true);
		binder.registerCustomEditor(BigDecimal.class, "amount", numberEditor);
		
		//Register custom editor for currency field
		CurrencyPropertyEditor currencyPropertyEditor = new CurrencyPropertyEditor();
		binder.registerCustomEditor(Currency.class, "currency", currencyPropertyEditor);
		
		binder.addCustomFormatter(new CreditCardFormatter());
		
		
	}
}
