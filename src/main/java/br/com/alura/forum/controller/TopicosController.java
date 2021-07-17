package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
//	@ResponseBody
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Título", "Mensagem", new Curso("Nome do curso", "Categoria"));
//		topico.setId(111L);
		
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));		
	}
		
}
