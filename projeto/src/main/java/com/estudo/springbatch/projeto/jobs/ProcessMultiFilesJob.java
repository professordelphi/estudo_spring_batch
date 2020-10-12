package com.estudo.springbatch.projeto.jobs;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@Component
public class ProcessMultiFilesJob {
//	private static final Logger log = LoggerFactory.getLogger(ProcessMultiFilesJob.class);


	@Scheduled(cron = "*/2 * * * * *") 
	public void verificaPorHora() { 
	    // Código que realiza a consulta de fluxo de vendas 
		
		System.out.println("okkkkkkkkkkkk Executando a tarefa!!!!!!!!!!");
		
		log.info("mensagem do log");
	}
	
	
}