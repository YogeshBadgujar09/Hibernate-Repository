package com.igc.contactmanager;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="addressBook")
public class AddressBook {
	@Id
	Integer id;
	String addressBookName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddressBookName() {
		return addressBookName;
	}
	public void setAddressBookName(String addressBookName) {
		this.addressBookName = addressBookName;
	}
	@Override
	public String toString() {
		return "AddressBook [id=" + id + ", addressBookName=" + addressBookName + "]";
	}
	
}
