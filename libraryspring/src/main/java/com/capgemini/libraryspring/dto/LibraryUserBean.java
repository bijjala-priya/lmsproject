package com.capgemini.libraryspring.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@SuppressWarnings("serial")
@Entity
@Table(name = "library_users")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LibraryUserBean implements Serializable {

	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String emailId;
	@Column
	private String password;
	@Column
	private String role;
	@Column
	private int noOfBooksBorrowed;
	@Column
	private double fine;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getNoOfBooksBorrowed() {
		return noOfBooksBorrowed;
	}

	public void setNoOfBooksBorrowed(int noOfBooksBorrowed) {
		this.noOfBooksBorrowed = noOfBooksBorrowed;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

}
