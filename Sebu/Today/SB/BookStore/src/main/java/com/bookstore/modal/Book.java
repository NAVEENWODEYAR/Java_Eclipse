package com.bookstore.modal;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Book
{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(name = "Book Name")
		private String bName;
		
		@Column(name = "Book Author")
		private String bAuthor;
		
		@Column(name = "Book Category")
		private String bType;
		
		@Column(name = "Book Price")
		private double bPrice;
		
		@Column(name = "Author Email")
		private String aMail;

		
		// parameterized constructor..,
		public Book(String bName, String bAuthor, String bType, double bPrice, String aMail)
		{
			super();
			this.bName = bName;
			this.bAuthor = bAuthor;
			this.bType = bType;
			this.bPrice = bPrice;
			this.aMail = aMail;
		}


		public Book(Book bk) 
		{
			
		}

		// setters and getters.,
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getbName() {
			return bName;
		}


		public void setbName(String bName) {
			this.bName = bName;
		}


		public String getbAuthor() {
			return bAuthor;
		}


		public void setbAuthor(String bAuthor) {
			this.bAuthor = bAuthor;
		}


		public String getbType() {
			return bType;
		}


		public void setbType(String bType) {
			this.bType = bType;
		}


		public double getbPrice() {
			return bPrice;
		}


		public void setbPrice(double bPrice) {
			this.bPrice = bPrice;
		}


		public String getaMail() {
			return aMail;
		}


		public void setaMail(String aMail) {
			this.aMail = aMail;
		}
		
		
		
}
