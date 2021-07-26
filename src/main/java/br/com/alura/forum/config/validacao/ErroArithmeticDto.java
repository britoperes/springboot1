package br.com.alura.forum.config.validacao;

public class ErroArithmeticDto {
	private String erro = "Arithmetic Exception";
	private String mensagem;
	
	public ErroArithmeticDto(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getErro() {
		return this.erro;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}
}
