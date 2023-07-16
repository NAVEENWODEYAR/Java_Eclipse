package com.oignon.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.oignon.modal.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ResponseDTO 
{
	public ResponseDTO(String string, User user1) {
		// TODO Auto-generated constructor stub
	}
	public ResponseDTO(String string, List<User> user) {
		// TODO Auto-generated constructor stub
	}
	public ResponseDTO(String string, String s) {
		// TODO Auto-generated constructor stub
	}
	private String msg;
	private Object obj;
}
