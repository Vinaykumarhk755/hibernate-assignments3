package com.dxc.hibernateassignment3;

import java.util.Date;

public class Customer {
private int customer_id;
 private String customer_name;
 private Date customer_dob;
 private String customer_email;

public Customer() {}
public Customer(int customer_id, String customer_name, Date customer_dob, String customer_email) {
	super();
	this.customer_id = customer_id;
	this.customer_name = customer_name;
	this.customer_dob = customer_dob;
	this.customer_email = customer_email;
}
public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}
public String getCustomer_name() {
	return customer_name;
}
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}
public Date getCustomer_dob() {
	return customer_dob;
}
public void setCustomer_dob(Date customer_dob) {
	this.customer_dob = customer_dob;
}
public String getCustomer_email() {
	return customer_email;
}
public void setCustomer_email(String customer_email) {
	this.customer_email = customer_email;
}

}
