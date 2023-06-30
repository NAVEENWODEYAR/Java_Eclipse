package com.mango.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Mango
{	
	@Id
	private String id;
	@NonNull
	private int m_Id;
	@NonNull
	private String m_Name;
	private String m_Category;
	private double m_Price;
	
	// parameterized constructor..,
		public Mango(int m_Id, String m_Name, String m_Category, double m_Price) 
		{
			super();
			this.m_Id = m_Id;
			this.m_Name = m_Name;
			this.m_Category = m_Category;
			this.m_Price = m_Price;
		}
	// toString()
		@Override
		public String toString() 
		{
			return "Mango [id=" + id + ", m_Id=" + m_Id + ", m_Name=" + m_Name + ", m_Category=" + m_Category
					+ ", m_Price=" + m_Price + "]";
		}
			
}
