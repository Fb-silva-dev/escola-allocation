package com.example.escolaallocation.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Alunos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "sobrenome", nullable = false)
	private String Sobrenome;

	@Column(name = "matricula", nullable = false, unique = true)
	private int matricula;

	@Enumerated(EnumType.STRING)
	@Column(name = "dataNascimento", nullable = false)
	private Date dataNascimento;

	@Column(name = "hostoricoComportamento", nullable = false)
	private String historicoComportamento;

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
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getHistoricoComportamento() {
		return historicoComportamento;
	}

	public void setHistoricoComportamento(String historicoComportamento) {
		this.historicoComportamento = historicoComportamento;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", Sobrenome=" + Sobrenome + ", matricula=" + matricula
				+ ", dataNascimento=" + dataNascimento + ", historicoComportamento=" + historicoComportamento + "]";
	}

}
