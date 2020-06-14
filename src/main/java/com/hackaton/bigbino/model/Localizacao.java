package com.hackaton.bigbino.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "localizacao")
public class Localizacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_LOCALIZACAO")
	@SequenceGenerator(name="SEQ_LOCALIZACAO", sequenceName="id_seq_localizacao", allocationSize=1)
    private long id;
	private boolean exata;
	private Double latitude;
	private Double longitude;
	
	public Localizacao() {
	}
	
	public Localizacao(boolean exata, Double latitude, Double longitude) {
		this.exata = exata;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public boolean isExata() {
		return exata;
	}
	
	public void setExata(boolean exata) {
		this.exata = exata;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	

}
