package edu.mum.cs545.lms.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CheckOutRecord implements Serializable {
	
	@Id @GeneratedValue
	private Long id;
	private String ISBN;
	private String memberID;
	private LocalDate dueDate;
	private LocalDate dateCheckout;
	
	public CheckOutRecord(){}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getDateCheckout() {
		return dateCheckout;
	}

	public void setDateCheckout(LocalDate dateCheckout) {
		this.dateCheckout = dateCheckout;
	}
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
}	

