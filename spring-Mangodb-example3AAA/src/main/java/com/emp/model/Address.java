package com.emp.model;

public class Address {

	private String Line1;
	private String Line2;
	private String city;
	private String state;
	private int ZipCode;



	public Address(String line1, String line2, String city, String state, int zipCode) {
		super();
		Line1 = line1;
		Line2 = line2;
		this.city = city;
		this.state = state;
		ZipCode = zipCode;
	}

	public String getLine1() {
		return Line1;
	}

	public void setLine1(String line1) {
		Line1 = line1;
	}

	public String getLine2() {
		return Line2;
	}

	public void setLine2(String line2) {
		Line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return ZipCode;
	}

	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}

}
