package com.exercise;
class CreditCard implements PaymentGateway
{
	private String credit_no;
	private String holder_name;
	private String expire_date;
	private String cvv;
	
	public CreditCard(String credit_no, String holder_name, String expire_date, String cvv)
	{
		this.credit_no=credit_no;
		this.holder_name=holder_name;
		this.expire_date=expire_date;
		this.cvv=cvv;
	}
	public void processPayment(double amount)
	{
		if(validatePayment())
			System.out.println("Processing Credit card amount : "+amount);
		else
			System.out.println("Credit card invalid....");
	}
	public void genrateReceipt()
	{
		System.out.println("Genrating Reciept for Credit Card....");
	}
	public boolean validatePayment()
	{
		return credit_no != null && credit_no.length() == 16 && cvv != null && cvv.length() == 3;
	}
}

class AccountDetail implements PaymentGateway
{
	private String email;
	private String password;
	
	public AccountDetail(String email, String password)
	{
		this.email=email;
		this.password=password;
	}
	public void processPayment(double amount)
	{
		if(validatePayment())
			System.out.println("Processing Payment  :  "+amount);
		else
			System.out.println("Credit Card invalid...");
	}
	public void genrateReceipt()
	{
		System.out.println("Genrating Reciept for Credit Card....");
	}
	public boolean validatePayment()
	{
		return email != null && email.contains("@") && password != null && password.length() <= 6;
	}
	
}

public class PaymentProcess 
{
	public static void main(String[] args) 
	{
		PaymentGateway pg=new CreditCard("1234567890123456", "Amanhusain", "26-12-2034", "543");
		pg.processPayment(250.54);
		pg.genrateReceipt();
		
		PaymentGateway pg1=new AccountDetail("ansariaman242@gmail.com", "123456");
	    pg1.processPayment(123.43);
	    pg1.genrateReceipt();
		
	}
}
