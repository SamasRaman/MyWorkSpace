package com.training.strategy;

public class EWallet implements Payment{
	
	private String email;
	private String password;
	private String walletName;
	
	public EWallet(String email, String password, String walletName) {
		super();
		this.email = email;
		this.password = password;
		this.walletName = walletName;
	}

	@Override
	public void pay(int amount) {
		if(this.walletName.equalsIgnoreCase("hdfc")) {
			amount=(int) (amount-(amount*0.1));
			System.out.println("Payment with hdfc and got a discount of::"+amount);
		}
	}
	
	

}
