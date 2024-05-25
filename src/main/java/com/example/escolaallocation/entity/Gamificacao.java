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

	public String getRecompensaRontuacao() {
		return recompensaPontuacao;
	}

	public void setRecompensaRontuacao(String recompensaRontuacao) {
		this.recompensaPontuacao = recompensaRontuacao;
	}

	public String getMossoesTarefas() {
		return missoesTarefas;
	}

	public void setMossoesTarefas(String mossoesTarefas) {
		this.missoesTarefas = mossoesTarefas;
	}

	public String getRankingAmigavel() {
		return rankingAmigavel;
	}

	public void setRankingAmigavel(String rankingAmigavel) {
		this.rankingAmigavel = rankingAmigavel;
	}

	public String getPersonalizaçãoAvatar() {
		return personalizacaoAvatar;
	}

	public void setPersonalizaçãoAvatar(String personalizaçãoAvatar) {
		this.personalizacaoAvatar = personalizaçãoAvatar;
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
				+ desafiosMentais + ", recompensaRontuacao=" + recompensaPontuacao + ", mossoesTarefas="
				+ missoesTarefas + ", rankingAmigavel=" + rankingAmigavel + ", personalizaçãoAvatar="
				+ personalizacaoAvatar + ", celebrarConquistas=" + celebrarConquistas + "]";
	}

	
}
