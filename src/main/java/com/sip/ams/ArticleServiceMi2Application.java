package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ArticleServiceMi2Application {

	public static void main(String[] args) {
		SpringApplication.run(ArticleServiceMi2Application.class, args);
	}

	// Appel d'un webservice externe avec l'api RestTemplate
	@Bean
	public RestTemplate getProviderFromMicroServiceProvider() {
		return new RestTemplate();
	}

}
