package com.example.hashicorpvault;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(VaultConfig.class)
@Slf4j
public class HashicorpvaultApplication implements CommandLineRunner {

	public HashicorpvaultApplication(VaultConfig vaultConfig) {
		this.vaultConfig = vaultConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(HashicorpvaultApplication.class, args);
	}

	private VaultConfig vaultConfig;

	@Override
	public void run(String... args) throws Exception {
		log.info("started----------------------");
		System.out.println("secret:" + vaultConfig.getUser());
		log.info("*** secret username: " + vaultConfig.getUser());
	}
}
