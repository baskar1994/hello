package com.entity;

import java.util.Date;

public class Customer {
	
	private int cif;
	private String title;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String email;
	private String phone;
	private String gender;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private int blacklist;
	private int idType;
	private int addressType;
	private String idNo;
	private String addressNo;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int cif, String title, String firstName, String lastName, String dateOfBirth, String email,
			String phone, String gender, String address, String city, String state, int zipcode, int blacklist,
			int idType, int addressType, String idNo, String addressNo) {
		super();
		this.cif = cif;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.blacklist = blacklist;
		this.idType = idType;
		this.addressType = addressType;
		this.idNo = idNo;
		this.addressNo = addressNo;
	}
	@Override
	public String toString() {
		return "Customer1 [cif=" + cif + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", phone=" + phone + ", gender=" + gender
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", blacklist=" + blacklist + ", idType=" + idType + ", addressType=" + addressType + ", idNo=" + idNo
				+ ", addressNo=" + addressNo + "]";
	}
	public int getCif() {
		return cif;
	}
	public void setCif(int cif) {
		this.cif = cif;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth= dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public int getBlacklist() {
		return blacklist;
	}
	public void setBlacklist(int blacklist) {
		this.blacklist = blacklist;
	}
	public int getIdType() {
		return idType;
	}
	public void setIdType(int idType) {
		this.idType = idType;
	}
	public int getAddressType() {
		return addressType;
	}
	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getAddressNo() {
		return addressNo;
	}
	public void setAddressNo(String addressNo) {
		this.addressNo = addressNo;
	}
	
	

}
