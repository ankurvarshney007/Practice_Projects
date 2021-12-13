package org.nagarro.Restwebservice.Entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String email;
	private String firstName;
	private String middleName;
	private String lastName;
	private String salutation;
	private String address;
	
	@Column(unique=true)
	private int phonenumber;
	private int alternatePhoneno;
	
	private String alternateEmail;
	private String fax;
	private String userType;
	private String taxID;
	private String password;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSalutation() {
		return salutation;
	}
	
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getPhonenumber() {
		return phonenumber;
	}
	
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public int getAlternatePhoneno() {
		return alternatePhoneno;
	}
	
	public void setAlternatePhoneno(int alternatePhoneno) {
		this.alternatePhoneno = alternatePhoneno;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	public String getFax() {
		return fax;
	}
	
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public String getUserType() {
		return userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getTaxID() {
		return taxID;
	}
	
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String email, String firstName, String middleName, String lastName, String salutation, String address,
			int phonenumber, int alternatePhoneno, String alternateEmail, String fax, String userType, String taxID,
			String password) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.salutation = salutation;
		this.address = address;
		this.phonenumber = phonenumber;
		this.alternatePhoneno = alternatePhoneno;
		this.alternateEmail = alternateEmail;
		this.fax = fax;
		this.userType = userType;
		this.taxID = taxID;
		this.password = password;
	}
	
	
}
