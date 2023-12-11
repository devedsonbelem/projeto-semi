package br.com.arq.interfaces;

import br.com.arq.dto.EmailDto;

public interface IEmailService {

	 public String enviarEmail(EmailDto dto) throws Exception;
	 
}
