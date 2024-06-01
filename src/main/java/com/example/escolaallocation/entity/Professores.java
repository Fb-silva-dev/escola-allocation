package com.example.escolaallocation.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

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
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@Id
	@Column(nullable = false)
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
	
	// ainda não se se vai ficar essa anotação
	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(name = "departmentos_id", nullable = false, unique = true)
	private Long departmentos_id;
	
	// ainda não se se vai ficar essa anotação
		@JsonProperty(access = Access.WRITE_ONLY)
		@Column(name = "contatos_id", nullable = false, unique = true)
		private Long contatos_id;
	
	public Long getDepartmentos_id() {
			return departmentos_id;
		}

		public Long getContatos_id() {
			return contatos_id;
		}

		public Departamentos getDepartamentos() {
			return departamentos;
		}

		public List<Contatos> getContatos() {
			return contatos;
		}

		public void setDepartmentos_id(Long departmentos_id) {
			this.departmentos_id = departmentos_id;
		}

		public void setContatos_id(Long contatos_id) {
			this.contatos_id = contatos_id;
		}

		public void setDepartamentos(Departamentos departamentos) {
			this.departamentos = departamentos;
		}

		public void setContatos(List<Contatos> contatos) {
			this.contatos = contatos;
		}

	@ManyToOne
	@JoinColumn(name = "departamentos_id",insertable = false, updatable = false, nullable = false)
	private Departamentos departamentos  ;
	
	@ManyToOne
	@JoinColumn(name = "contatos_id",insertable = false, updatable = false, nullable = false)
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
		return "Professores [id=" + id + ", name=" + name + ", sobrenome=" + sobrenome + ", matricula=" + matricula
				+ ", cpf=" + cpf + ", departmentos_id=" + departmentos_id + ", contatos_id=" + contatos_id
				+ ", departamentos=" + departamentos + ", contatos=" + contatos + "]";
	}

}
