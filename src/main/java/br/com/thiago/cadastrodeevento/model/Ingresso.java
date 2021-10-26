package br.com.thiago.cadastrodeevento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingresso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idIngresso;
	
	@Column(length=100,nullable=false)
	private String nomeIngresso;
	
	@Column
	private String telefoneIngresso;

	public Ingresso() {
	}

	public Ingresso(Long idIngresso, String nomeIngresso, String telefoneIngresso) {
		this.idIngresso = idIngresso;
		this.nomeIngresso = nomeIngresso;
		this.telefoneIngresso = telefoneIngresso;
	}

	public Long getIdIngresso() {
		return idIngresso;
	}

	public void setIdIngresso(Long idIngresso) {
		this.idIngresso = idIngresso;
	}

	public String getNomeIngresso() {
		return nomeIngresso;
	}

	public void setNomeIngresso(String nomeIngresso) {
		this.nomeIngresso = nomeIngresso;
	}

	public String getTelefoneIngresso() {
		return telefoneIngresso;
	}

	public void setTelefoneIngresso(String telefoneIngresso) {
		this.telefoneIngresso = telefoneIngresso;
	}

	
}
