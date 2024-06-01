package com.example.escolaallocation.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamentos {

	@JsonProperty(access = Access.WRITE_ONLY)
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@OneToMany
	@JoinColumn(name = "professores_id", nullable = false)
	private Professores professores;
	
	@OneToMany
	@JoinColumn(name = "contatos_id", nullable = false)
	private Contatos contatos;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Professores getProfessores() {
		return professores;
	}

	public Contatos getContatos() {
		return contatos;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setProfessores(Professores professores) {
		this.professores = professores;
	}

	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}

	@Override
	public String toString() {
		return "Departamentos [id=" + id + ", nome=" + nome + ", professores=" + professores + ", contatos=" + contatos
				+ "]";
	}

	
}
