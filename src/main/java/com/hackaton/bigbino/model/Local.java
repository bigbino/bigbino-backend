package com.hackaton.bigbino.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "local")
public class Local {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String nome;
	private String empresaResponsavel;
	private String descricao;
	
	@ManyToMany
	@JoinTable(name="local_horarios", schema="public", joinColumns = @JoinColumn(name="id_local"), inverseJoinColumns = @JoinColumn(name="id_horario"))
	private List<Horario> horarios;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_localizacao")
	private Localizacao localizacao;
	
	public Local() {
	}

	public Local(String nome, String empresaResponsavel, String descricao, List<Horario> horarios,
			Localizacao localizacao) {
		super();
		this.nome = nome;
		this.empresaResponsavel = empresaResponsavel;
		this.descricao = descricao;
		this.horarios = horarios;
		this.localizacao = localizacao;
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

	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	
	

}
