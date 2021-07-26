package br.com.alura.forum.config.validacao;

public class ErroDeFormularioDto {
	
	private String campo;
	private String mensagem;
	
	public ErroDeFormularioDto(String campo, String mensagem) {
		this.campo = campo;
		this.mensagem = mensagem;
	}
	
	public String getCampo(){
		return this.campo;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}

}
