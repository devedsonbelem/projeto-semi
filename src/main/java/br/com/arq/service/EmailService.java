package br.com.arq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import br.com.arq.dto.EmailDto;
import br.com.arq.interfaces.IEmailService;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService implements IEmailService{

	@Autowired
	private JavaMailSender mailSender;
	 
	@Override
	public String enviarEmail(EmailDto dto) throws Exception {
		 try {
		MimeMessage message = mailSender.createMimeMessage();
		
		message.setFrom(new InternetAddress(dto.getDe()));
		message.setRecipients(MimeMessage.RecipientType.TO, dto.getPara());
		message.setSubject(dto.getAssunto());
 
		  String html =  "<h2>Seja bem vindo a arq treinamento</h2>"+
		                 "<br/>Olá <b>" + dto.getPara() +", Obrigado pelo cadastro </b>";
		
		    dto.setMensagemm(html);
		
		 message.setContent( dto.getMensagemm() , "text/html; charset=utf-8");
		 mailSender.send(message);
		 return "Enviado com Sucesso ...";
		 }catch(Exception ex) {
		   throw new Exception("Error no Envio do Email");
		 }
     }

}
