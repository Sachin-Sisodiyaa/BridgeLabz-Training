package com.dayseven.artify;

public class PrintArt extends Artwork implements IPurchasable {

	public PrintArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}

	@Override
	public double purchase() {
		return getPrice();
	}

	@Override
	public String license() {
		return getLicenseType();
	}

}
