package com.example.escolaallocation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "salaAula")
public class SalaDeAula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "identificador", nullable = false)
	private String identificador;
	
	@Column(name = "capacidade", nullable = false)
	private int capacidade;
	
	@Column(name = "localizacao", nullable = false)
	private String localizacao;
	
	@Column(name = "equipamentos", nullable = false)
	private String equipamentos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getLocalização() {
		return localizacao;
	}

	public void setLocalização(String localização) {
		this.localizacao = localização;
	}

	public String getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(String equipamentos) {
		this.equipamentos = equipamentos;
	}

	@Override
	public String toString() {
		return "SalaDeAula [id=" + id + ", identificador=" + identificador + ", capacidade=" + capacidade
				+ ", localização=" + localizacao + ", equipamentos=" + equipamentos + "]";
	}

}
