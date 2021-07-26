package br.com.alura.forum.config.validacao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErroDeValidacaoHandler {
	
	@Autowired
	private MessageSource messageSource;
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ErroDeFormularioDto> handle(MethodArgumentNotValidException ex){
		List<ErroDeFormularioDto> listaErros = new ArrayList<>();
		ex.getBindingResult().getFieldErrors().forEach(e-> {
			listaErros.add
			(new ErroDeFormularioDto(e.getField(), messageSource.getMessage(e, LocaleContextHolder.getLocale())));
		});
		return listaErros;
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ArithmeticException.class)
	public ErroArithmeticDto handle(ArithmeticException ex){
		ErroArithmeticDto erro = new ErroArithmeticDto(ex.getMessage());
		return erro;
	}
	
}
