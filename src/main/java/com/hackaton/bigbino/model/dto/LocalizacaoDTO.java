package com.hackaton.bigbino.model.dto;

import com.hackaton.bigbino.model.Localizacao;

public class LocalizacaoDTO {
	
	private long id;
	
	private boolean exata;
	
	private Double latitude;
	
	private Double longitude;
	
	public LocalizacaoDTO() {
	}
	
	public LocalizacaoDTO(Localizacao localizacao) {
		setId(localizacao.getId());
		setExata(localizacao.isExata());
		setLatitude(localizacao.getLatitude());
		setLongitude(localizacao.getLongitude());		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	public static class Builder {
		private Localizacao localizacao;
		public Builder(LocalizacaoDTO dto) {
			localizacao = new Localizacao();
			localizacao.setExata(dto.isExata());
			localizacao.setLatitude(dto.getLatitude());
			localizacao.setLongitude(dto.getLongitude());
		}
		
		public Localizacao build() {
			return localizacao;
		}
	}

}
