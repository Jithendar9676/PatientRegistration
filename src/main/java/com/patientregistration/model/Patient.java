package com.patientregistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String address;
	private String contact;
	private String details;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Integer id, String name, String address, String contact, String details) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.details = details;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "patient [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", details="
				+ details + "]";
	}
	
	
}
