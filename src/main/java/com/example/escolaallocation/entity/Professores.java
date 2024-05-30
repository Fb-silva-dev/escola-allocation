package com.example.escolaallocation.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesorres")
public class Professores {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "sobrenome", nullable = false)
	private String sobrenome;
	
	@Column(name = "matricula", nullable = false)
	private int matricula;
	
	@Column(name = "cpf", nullable = false, unique = true, length = 11)
	private String cpf;
	
	@ManyToOne
	@JoinColumn(name = "departamentos_id", nullable = false)
	private Departamentos departamentos  ;
	
	@ManyToOne
	@JoinColumn(name = "contatos_id", nullable = false)
	private List<Contatos>contatos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", sobrenome=" + sobrenome + ", matricula=" + matricula
				+ ", cpf=" + cpf + "]";
	}

}
