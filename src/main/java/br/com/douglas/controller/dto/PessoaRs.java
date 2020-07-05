package br.com.douglas.controller.dto;

import br.com.douglas.model.Pessoa;

public class PessoaRs {

	private Long id;
	private String nome;
	private String sobrenome;
	
	public PessoaRs() {
		super();
	}
	
	public PessoaRs(Long id, String nome, String sobrenome) {
		super();
		this.setId(id);
		this.setNome(nome);
		this.setSobrenome(sobrenome);
	}
	
	public static PessoaRs converter(Pessoa p) {
		return new PessoaRs(p.getId(), p.getNome(), p.getSobrenome());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
