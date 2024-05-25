package com.example.escolaallocation.entity;

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
	private String identificador;
	private int capacidade;
	private String localização;
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
		return localização;
	}

	public void setLocalização(String localização) {
		this.localização = localização;
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
				+ ", localização=" + localização + ", equipamentos=" + equipamentos + "]";
	}

}
