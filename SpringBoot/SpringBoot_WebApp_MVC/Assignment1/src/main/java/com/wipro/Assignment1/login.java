package com.wipro.Assignment1;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class login {
	
	@NotEmpty(message = "Please enter Name")
	private String name;
	
	@NotEmpty(message = "please enter Password")
	@NotNull
	private String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
