package com.oignon.modal;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "User_Table")
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int uId;
	private String uName;
	private String uMail;
	private double uSal;
	private Date date;
	
	// parameterized constructor
		public User(String uName, String uMail, double uSal, Date date)
		{
			super();
			this.uName = uName;
			this.uMail = uMail;
			this.uSal = uSal;
			this.date = date;
		}

		// setters and getters.,
		public int getuId() {
			return uId;
		}

		public void setuId(int uId) {
			this.uId = uId;
		}

		public String getuName() {
			return uName;
		}

		public void setuName(String uName) {
			this.uName = uName;
		}

		public String getuMail() {
			return uMail;
		}

		public void setuMail(String uMail) {
			this.uMail = uMail;
		}

		public double getuSal() {
			return uSal;
		}

		public void setuSal(double uSal) {
			this.uSal = uSal;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public User() {
			super();
		}
		
}
