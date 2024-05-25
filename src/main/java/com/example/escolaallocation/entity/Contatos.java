package com.example.escolaallocation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contatos")
public class Contatos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "rua", nullable = false)
	private String rua;
	
	@Column(name = "numero", nullable = false)
	private String numero;
	
	@Column(name = "numero", nullable = false)
	private String bairro;
	
	@Column(name = "cep", nullable = false)
	private int cep;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep
				+ "]";
	}

}
