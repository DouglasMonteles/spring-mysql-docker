package br.com.douglas.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.douglas.controller.dto.PessoaRs;
import br.com.douglas.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	private PessoaRepository repository;
	
	public PessoaController(PessoaRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping
	public List<PessoaRs> findAll() {
		var pessoa = repository.findAll();
		
		return pessoa
				.stream()
				.map(PessoaRs::converter)
				.collect(Collectors.toList());
	}
	
	@GetMapping("/{id}")
	public PessoaRs findById(@PathVariable Long id) {
		var pessoa = repository.getOne(id);
		
		return PessoaRs.converter(pessoa);
	}
	
}
