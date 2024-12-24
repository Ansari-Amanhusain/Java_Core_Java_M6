package com.exercise;

public interface PaymentGateway 
{
	public void processPayment(double amount);
	public void genrateReceipt();
	public boolean validatePayment();
}
