package com.estudo.springbatch.projeto;





import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableBatchProcessing
@EnableScheduling
public class ProjetoApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		

	}

}
