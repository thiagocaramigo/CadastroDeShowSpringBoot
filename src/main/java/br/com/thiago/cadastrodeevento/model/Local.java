package br.com.thiago.cadastrodeevento.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Local {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLocal;
	
	@Column
	private Long idFa;
	
	@Column
	private Long idArtista;
	
	@Column(nullable=false)
	private Date dataDataHora;
	
	@Column(nullable=false)
	private String horaDataHora;

	public Local() {
	}

	public Local(Long idLocal, Long idFa, Long idArtista, Date dataDataHora, String horaDataHora) {
		this.idLocal = idLocal;
		this.idFa = idFa;
		this.idArtista = idArtista;
		this.dataDataHora = dataDataHora;
		this.horaDataHora = horaDataHora;
	}

	public Long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}

	public Long getIdFa() {
		return idFa;
	}

	public void setIdFa(Long idFa) {
		this.idFa = idFa;
	}

	public Long getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(Long idArtista) {
		this.idArtista = idArtista;
	}

	public Date getDataDataHora() {
		return dataDataHora;
	}

	public void setDataDataHora(Date dataDataHora) {
		this.dataDataHora = dataDataHora;
	}

	public String getHoraDataHora() {
		return horaDataHora;
	}

	public void setHoraDataHora(String horaDataHora) {
		this.horaDataHora = horaDataHora;
	}

	

}
