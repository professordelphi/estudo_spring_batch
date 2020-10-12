package com.estudo.springbatch.projeto.tasklet;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class FileDeletingTasklet {

	@Scheduled(cron = "*/2 * * * * *") 
public void verificaPorHora() { 
    // Código que realiza a consulta de fluxo de vendas 
	
	log.info("log info !!!!");
}


}
