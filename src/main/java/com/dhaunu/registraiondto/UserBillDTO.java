package com.dhaunu.registraiondto;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class UserBillDTO {

	private BigDecimal amount;
	private Currency currency;
	private Date date;
	private CreditCard creditcard;
	
	public UserBillDTO() {
		
		System.out.println("My bill constr method has been called");
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public CreditCard getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}

	@Override
	public String toString() {
		return "UserBillDTO [amount=" + amount + ", currency=" + currency + ", date=" + date + ", creditcard="
				+ creditcard + "]";
	}
	
	
}
