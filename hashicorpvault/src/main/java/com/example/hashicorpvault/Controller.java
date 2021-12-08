package com.example.hashicorpvault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Controller {

	@Autowired
	VaultConfig config;

	@GetMapping(value = "/getvault")
	public String firstPage() throws IOException {
		String user = config.getUser();
		System.out.println(user);
		return user;
	}
}
