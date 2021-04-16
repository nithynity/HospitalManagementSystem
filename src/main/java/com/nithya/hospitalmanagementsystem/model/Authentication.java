package com.nithya.hospitalmanagementsystem.model;

public class Authentication {
	
	public boolean authenticated;

	@Override
	public String toString() {
		return "Authentication [isAuthenticated=" + authenticated + "]";
	}

	public Authentication(boolean isAuthenticated) {
		super();
		this.authenticated = isAuthenticated;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(boolean isAuthenticated) {
		this.authenticated = isAuthenticated;
	}

}
