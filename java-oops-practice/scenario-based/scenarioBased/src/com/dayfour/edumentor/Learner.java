package com.dayfour.edumentor;

public class Learner extends User implements ICertifiable{
    
	private double percentage;
	
	public Learner(String name, String email, String userId) {
		super(name, email, userId);
	}

	void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public void generateCertificate() {
		System.out.println("\n---------------------------------------------------------------");
		System.out.println("\n\t\t\tCertificate");
		System.out.println("\n---------------------------------------------------------------");
		System.out.println("\n\tCongratulations! You Achieve Learner Certificate");
		System.out.println("\n\tUser Id: " + userId);
		System.out.println("\n\tCertificate provided to: " + name);
		System.out.println("\n\tEmail: " + email);
		System.out.println("\n\tScore: " + percentage + "%");
		System.out.println("\n----------------------------------------------------------------");
	}
}