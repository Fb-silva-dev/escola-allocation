package com.example.escolaallocation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notas")
public class Notas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nota", nullable = false)
	private float nota;

	@Column(name = "faltas", nullable = false)
	private int faltas;

	@Column(name = "observacaoDesempenho", nullable = false)
	private String observacaoDesempenho;

	@Column(name = "historicoNotas", nullable = false)
	private String historicoNotas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public String getObservacaoDesempenho() {
		return observacaoDesempenho;
	}

	public void setObservacaoDesempenho(String observacaoDesempenho) {
		this.observacaoDesempenho = observacaoDesempenho;
	}

	public String getHistoricoNotas() {
		return historicoNotas;
	}

	public void setHistoricoNotas(String historicoNotas) {
		this.historicoNotas = historicoNotas;
	}

	@Override
	public String toString() {
		return "Notas [id=" + id + ", nota=" + nota + ", faltas=" + faltas + ", observacaoDesempenho="
				+ observacaoDesempenho + ", historicoNotas=" + historicoNotas + "]";
	}

}
