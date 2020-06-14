package com.hackaton.bigbino.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.hackaton.bigbino.model.Horario;
import com.hackaton.bigbino.model.Local;

public class LocalDTO {
	
	private long id;
	
	private String nome;
	
	private String empresaResponsavel;
	
	private String descricao;
	
	private List<HorarioDTO> horarios;
	
	private LocalizacaoDTO localizacao;
	
	public LocalDTO() {
	}
	
	
	public LocalDTO(Local local) {
		setId(local.getId());
		setNome(local.getNome());
		setEmpresaResponsavel(local.getEmpresaResponsavel());
		setDescricao(local.getDescricao());
		setHorarios(local.getHorarios().stream().map(HorarioDTO::new).collect(Collectors.toList()));
		setLocalizacao(new LocalizacaoDTO(local.getLocalizacao()));
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

	public LocalizacaoDTO getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(LocalizacaoDTO localizacao) {
		this.localizacao = localizacao;
	}
	
	public static class Builder {
		private Local local;
		public Builder(LocalDTO dto) {
			local = new Local();
			local.setNome(dto.getNome());
			local.setDescricao(dto.getDescricao());
			local.setEmpresaResponsavel(dto.getEmpresaResponsavel());
			List<Horario> horarios = new ArrayList<Horario>();
			dto.getHorarios().forEach(h ->{
				horarios.add(new HorarioDTO.Builder(h).build());
			});
			local.setHorarios(horarios);
			local.setLocalizacao(new LocalizacaoDTO.Builder(dto.getLocalizacao()).build());
		}
		
		public Local build() {
			return local;
		}
	}

}
