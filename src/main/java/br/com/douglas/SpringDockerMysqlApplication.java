package br.com.douglas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.douglas")
@EntityScan(basePackages = "br.com.douglas.model")
public class SpringDockerMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerMysqlApplication.class, args);
	}

}
