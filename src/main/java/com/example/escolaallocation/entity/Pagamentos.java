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
@Table(name = "pagamentos")
public class Pagamentos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tipoPagamento", nullable = false)
	private String tipoPagamento;
	
	@Column(name = "valor", nullable = false)
	private float valor;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "dataPagamento", nullable = false)
	private Date datePagamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getDatePagamento() {
		return datePagamento;
	}

	public void setDatePagamento(Date datePagamento) {
		this.datePagamento = datePagamento;
	}

	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", tipoPagamento=" + tipoPagamento + ", valor=" + valor + ", datePagamento="
				+ datePagamento + "]";
	}

}
