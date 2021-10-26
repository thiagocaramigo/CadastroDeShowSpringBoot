package br.com.thiago.cadastrodeevento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Artista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArtista;
	
	@Column(length=100, nullable=false)
	private String nomeArtista;
	
	@Column(length=100, nullable=false, unique=true)
	private String generomusical;
	
	@Column(length=20)
	private String telefoneArtista;

	public Artista() {
	}

	public Artista(Long idArtista, String nomeArtista, String generomusical, String telefoneArtista) {
		this.idArtista = idArtista;
		this.nomeArtista = nomeArtista;
		this.generomusical = generomusical;
		this.telefoneArtista = telefoneArtista;
	}

	public Long getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(Long idArtista) {
		this.idArtista = idArtista;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public String getGeneromusical() {
		return generomusical;
	}

	public void setGeneromusical(String generomusical) {
		this.generomusical = generomusical;
	}

	public String getTelefoneArtista() {
		return telefoneArtista;
	}

	public void setTelefoneArtista(String telefoneArtista) {
		this.telefoneArtista = telefoneArtista;
	}
	
	
	

}
