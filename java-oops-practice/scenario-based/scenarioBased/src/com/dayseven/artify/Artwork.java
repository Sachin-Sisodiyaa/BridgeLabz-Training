package com.dayseven.artify;

public class Artwork {
	protected String title;
	protected String artist;
	protected double price;
	private String licenseType;
	
	public Artwork(String title, String artist, double price, String licenseType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
	}
	
	public double getPrice() {
		return price;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	
	public void displayDetails() {
		System.out.println("\nTitle: " + title);
		System.out.println("Artist: " + artist);
		System.out.println("Price: " + price);
		System.out.println("LicenseType: " + getLicenseType());
	}
	
}
