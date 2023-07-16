package com.oignon.dto;

import java.util.Date;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO 
{
	 @Pattern(regexp = "^[A-Z]{1}[a-z]{3,}\\s{0,}[A-z]{1}[a-z]{2,}",message = "Invalid Employee name!")
	private String uName;
	
	@NotEmpty(message = "Name can't be empty")
	private String uMail;
	
	@Min(message = "Should be greater than 100000", value = 100000)
	private double uSal;
	
	@Past(message = "Should be present date.,")
	private Date date;
}
