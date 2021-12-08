package com.example.hashicorpvault;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hashi")
public class VaultConfig  {

	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


}