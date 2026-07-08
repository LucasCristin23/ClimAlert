package ar.edu.utn.edu.lucas_cristin.sistema_climalert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SistemaClimalertApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaClimalertApplication.class, args);
	}

}
