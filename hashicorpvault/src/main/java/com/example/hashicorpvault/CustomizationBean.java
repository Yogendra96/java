package com.example.hashicorpvault;

import org.springframework.cloud.vault.config.SecretBackendConfigurer;
import org.springframework.cloud.vault.config.VaultConfigurer;

public class CustomizationBean implements VaultConfigurer {

		@Override
		public void addSecretBackends(SecretBackendConfigurer configurer) {

			configurer.add("secret/hashicorpvault");

			configurer.registerDefaultKeyValueSecretBackends(false);
			configurer.registerDefaultDiscoveredSecretBackends(true);
		}
}
