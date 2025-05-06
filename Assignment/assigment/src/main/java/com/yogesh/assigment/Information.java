package com.yogesh.assigment;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
@javax.persistence.Table(name="information")
public class Information {
	@Id
	Integer id;
	String name;
	String mobileNo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobileNo;
	}
	public void setMobile(String mobile) {
		this.mobileNo = mobile;
	}
	
}
