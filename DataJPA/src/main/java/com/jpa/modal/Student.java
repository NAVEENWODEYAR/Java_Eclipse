package com.jpa.modal;

import java.util.UUID;

public class Student 
{
	private int stId;
	private UUID stSSN = UUID.randomUUID();
	private String stName;
	private String stClass;
	private String stAddress;
}
