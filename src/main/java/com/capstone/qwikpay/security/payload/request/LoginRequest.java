package com.capstone.qwikpay.security.payload.request;

import jakarta.validation.constraints.NotBlank;

import lombok.Generated;

@Generated
public class LoginRequest {
	@NotBlank
	private String username;

	@NotBlank
	private String password;

	public LoginRequest() {
		// TODO Auto-generated constructor stub
	}

	public LoginRequest(@NotBlank String username, @NotBlank String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
