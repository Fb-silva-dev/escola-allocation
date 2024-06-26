package com.example.escolaallocation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "responsaveis")
public class Responsaveis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sobrenome;
	private String relacaoAluno;
	private String acompanhamentoTratamento;

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

	public String getRelacaoAluno() {
		return relacaoAluno;
	}

	public void setRelacaoAluno(String relacaoAluno) {
		this.relacaoAluno = relacaoAluno;
	}

	public String getAcompanhamentoTratamento() {
		return acompanhamentoTratamento;
	}

	public void setAcompanhamentoTratamento(String acompanhamentoTratamento) {
		this.acompanhamentoTratamento = acompanhamentoTratamento;
	}

	@Override
	public String toString() {
		return "Responsavel [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", relacaoAluno="
				+ relacaoAluno + ", acompanhamentoTratamento=" + acompanhamentoTratamento + "]";
	}

}
