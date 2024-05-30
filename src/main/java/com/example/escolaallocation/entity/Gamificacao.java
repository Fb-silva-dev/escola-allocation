package com.example.escolaallocation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gamificacao")
public class Gamificacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nivelDesempenho", nullable = false)
	private int nivelDeDesempenho;

	@Column(name = "desafiosMentais", nullable = false)
	private String desafiosMentais;

	@Column(name = "recompensaPontuação", nullable = false)
	private String recompensaPontuacao;
	
	@Column(name = "desafiosMentais", nullable = false)
	private String missoesTarefas;

	@Column(name = "rankingAmigavel", nullable = false)
	private String rankingAmigavel;

	@Column(name = "personalizacaoAvatar", nullable = false)
	private String personalizacaoAvatar;

	@Column(name = "celebrarConquistas", nullable = false)
	private String celebrarConquistas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNivelDeDesempenho() {
		return nivelDeDesempenho;
	}

	public void setNivelDeDesempenho(int nivelDeDesempenho) {
		this.nivelDeDesempenho = nivelDeDesempenho;
	}

	public String getDesafiosMentais() {
		return desafiosMentais;
	}

	public void setDesafiosMentais(String desafiosMentais) {
		this.desafiosMentais = desafiosMentais;
	}

	public String getRecompensaPontuacao() {
		return recompensaPontuacao;
	}

	public void setRecompensaPontuacao(String recompensaPontuacao) {
		this.recompensaPontuacao = recompensaPontuacao;
	}

	public String getMissoesTarefas() {
		return missoesTarefas;
	}

	public void setMissoesTarefas(String missoesTarefas) {
		this.missoesTarefas = missoesTarefas;
	}

	public String getRankingAmigavel() {
		return rankingAmigavel;
	}

	public void setRankingAmigavel(String rankingAmigavel) {
		this.rankingAmigavel = rankingAmigavel;
	}

	public String getPersonalizacaoAvatar() {
		return personalizacaoAvatar;
	}

	public void setPersonalizacaoAvatar(String personalizacaoAvatar) {
		this.personalizacaoAvatar = personalizacaoAvatar;
	}

	public String getCelebrarConquistas() {
		return celebrarConquistas;
	}

	public void setCelebrarConquistas(String celebrarConquistas) {
		this.celebrarConquistas = celebrarConquistas;
	}

	@Override
	public String toString() {
		return "Gamificacao [id=" + id + ", nivelDeDesempenho=" + nivelDeDesempenho + ", desafiosMentais="
				+ desafiosMentais + ", recompensaPontuacao=" + recompensaPontuacao + ", missoesTarefas="
				+ missoesTarefas + ", rankingAmigavel=" + rankingAmigavel + ", personalizacaoAvatar="
				+ personalizacaoAvatar + ", celebrarConquistas=" + celebrarConquistas + "]";
	}

	
}
