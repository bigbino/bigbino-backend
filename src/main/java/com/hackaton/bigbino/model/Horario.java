package com.hackaton.bigbino.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "horario")
public class Horario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Enumerated(EnumType.STRING)
	private Dia diaSemana;
	
	private String horarioAbertura;
	
	private String horarioFechamento;
	
	public Horario() {
	}

	public Dia getDiaSemana() {
		return diaSemana;
	}
	
	public void setDiaSemana(Dia diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	public String getHorarioAbertura() {
		return horarioAbertura;
	}
	
	public void setHorarioAbertura(String horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}
	
	public String getHorarioFechamento() {
		return horarioFechamento;
	}
	
	public void setHorarioFechamento(String horarioFechamento) {
		this.horarioFechamento = horarioFechamento;
	}
	
}
