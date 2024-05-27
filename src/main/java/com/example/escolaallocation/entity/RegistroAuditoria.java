package com.example.escolaallocation.entity;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registroAuditoria")
public class RegistroAuditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "dataHora", nullable = false)
	private Timestamp dataHora;
	
	@Column(name = "acao", nullable = false)
	private String acao;
	
	@Column(name = "detalheAdicionais", nullable = false)
	private String detalheAdicionais;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getDataHora() {
		return dataHora;
	}

	public void setDataHora(Timestamp dataHora) {
		this.dataHora = dataHora;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getDetalheAdicionais() {
		return detalheAdicionais;
	}

	public void setDetalheAdicionais(String detalheAdicionais) {
		this.detalheAdicionais = detalheAdicionais;
	}

	@Override
	public String toString() {
		return "RegistroAuditoria [id=" + id + ", dataHora=" + dataHora + ", acao=" + acao + ", detalheAdicionais="
				+ detalheAdicionais + "]";
	}

}
