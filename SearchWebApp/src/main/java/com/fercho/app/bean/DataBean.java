/**
 * 
 */
package com.fercho.app.bean;

import org.apache.solr.client.solrj.beans.Field;

/**
 * @author ferzac
 *
 */
public class DataBean 
{
	private String id;
	private String name;
	private String email;
	private String address;
	private String phone;
	
	public DataBean(String _id, String _name, String _email, String _address, String _phone) 
	{
		setId(_id);
		setName(_name);
		setEmail(_email);
		setAddress(_address);
		setPhone(_phone);
	}
	
	@Field("id")
	public void setId(String id) {
		this.id = id;
	}
	
	@Field("name")
	public void setName(String name) {
		this.name = name;
	}
	
	@Field("email")
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Field("address")
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Field("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}
	
}
