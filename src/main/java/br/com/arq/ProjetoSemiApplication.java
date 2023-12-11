package br.com.arq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.arq.dto.EmailDto;
import br.com.arq.service.EmailService;

@SpringBootApplication
public class ProjetoSemiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSemiApplication.class, args);
	}

	@Autowired
	private EmailService send;
	
	@Override
	public void run(String... args) throws Exception {
		try {
		EmailDto dto = new EmailDto();
		  dto.setDe("profedsonbelem@gmail.com");
		  dto.setPara("lu.vmedeiros@gmail.com");
		  dto.setAssunto("Email de Boas Vindas");
		String resp= send.enviarEmail(dto);
		  System.out.println(resp);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
