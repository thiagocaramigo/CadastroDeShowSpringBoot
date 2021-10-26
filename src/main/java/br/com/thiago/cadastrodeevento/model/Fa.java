package br.com.thiago.cadastrodeevento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFa;
	
	@Column(length=100,nullable=false)
	private String nomeFa;
	
	@Column(length=100,nullable=false,unique=true)
	private String emailFa;
	
	@Column
	private String telefoneFa;

	public Fa() {
	}

	public Fa(Long idFa, String nomeFa, String emailFa, String telefoneFa) {
		this.idFa = idFa;
		this.nomeFa = nomeFa;
		this.emailFa = emailFa;
		this.telefoneFa = telefoneFa;
	}

	public Long getIdFa() {
		return idFa;
	}

	public void setIdFa(Long idFa) {
		this.idFa = idFa;
	}

	public String getNomeFa() {
		return nomeFa;
	}

	public void setNomeFa(String nomeFa) {
		this.nomeFa = nomeFa;
	}

	public String getEmailFa() {
		return emailFa;
	}

	public void setEmailFa(String emailFa) {
		this.emailFa = emailFa;
	}

	public String getTelefoneFa() {
		return telefoneFa;
	}

	public void setTelefoneFa(String telefoneFa) {
		this.telefoneFa = telefoneFa;
	}
	
	

}
