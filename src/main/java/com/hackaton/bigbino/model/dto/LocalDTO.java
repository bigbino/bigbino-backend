package com.hackaton.bigbino.model.dto;

import java.util.List;

import com.hackaton.bigbino.model.Local;
import com.hackaton.bigbino.model.Localizacao;

public class LocalDTO {
	
	private long id;
	
	private String nome;
	
	private String empresaResponsavel;
	
	private String descricao;
	
	private List<HorarioDTO> horarios;
	
	private Localizacao localizacao;
	
	public LocalDTO() {
	}
	
	//TODO
	public LocalDTO(Local local) {
//		setId(local.getId());
//		setNome(local.getNome());
//		setEmpresaResponsavel(local.getEmpresaResponsavel());
//		setDescricao(local.getDescricao());
//		setHorarios(local.getHorarios().stream());
//		setLocalizacao(local.getLocalizacao());
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmpresaResponsavel() {
		return empresaResponsavel;
	}

	public void setEmpresaResponsavel(String empresaResponsavel) {
		this.empresaResponsavel = empresaResponsavel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<HorarioDTO> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<HorarioDTO> horarios) {
		this.horarios = horarios;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	
	
	

}
