package br.com.arq.dto;

public class EmailDto {

	 private String de;
	 private String para;
	 private String mensagemm;
	 private String assunto;
	 
	 public EmailDto() {
		 
	}
	 

	@Override
	public String toString() {
		return "EmailDto [de=" + de + ", para=" + para + ", mensagemm=" + mensagemm + ", assunto=" + assunto + "]";
	}


	public EmailDto(String de, String para, String mensagemm, String assunto) {
		super();
		this.de = de;
		this.para = para;
		this.mensagemm = mensagemm;
		this.assunto = assunto;
	}







	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	public String getPara() {
		return para;
	}
	public void setPara(String para) {
		this.para = para;
	}
	public String getMensagemm() {
		return mensagemm;
	}
	public void setMensagemm(String mensagemm) {
		this.mensagemm = mensagemm;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	 
	 
	 
	 
	 
}
