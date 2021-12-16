package com.vault.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@EnableConfigurationProperties(Credential.class)
public class VaultController {

    @Autowired
    Credential config;

    @GetMapping(value = "/getvault")
    public String firstPage() throws IOException {
        String user = config.getUsername();
        String pass = config.getPassword();
        String cred = user + ":" + pass;
        System.out.println(cred);
        return cred;
    }
}