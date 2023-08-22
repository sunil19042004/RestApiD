package com.sunil.RestapiD.day1.Model;

import lombok.Data;

@Data
public class Address {
	private String name;
	private int doorNo;
	private String streetName;
	private int pincode;
	private String area ;
	private String district;
	private String state;
	private String country;
	public Address() {
		super();
	}
	public Address(String name, int doorNo, String streetName, int pincode, String area, String district, String state,
			String country) {
		super();
		this.name = name;
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.pincode = pincode;
		this.area = area;
		this.district = district;
		this.state = state;
		this.country = country;
	}
	public int setDoorNo(int i) {
		// TODO Auto-generated method stub
		return 6;
	}
	public void setArea(String area2) {
		// TODO Auto-generated method stub
		
	}
	public int setPincode(int i) {
		// TODO Auto-generated method stub
		return 638460;
		
	}


}
