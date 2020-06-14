package com.hackaton.bigbino.model.dto;

import com.hackaton.bigbino.model.Horario;
import com.hackaton.bigbino.model.enums.Dia;

public class HorarioDTO {
	
	private long id;
	
	private String diaSemana;
	
	private String horarioAbertura;
	
	private String horarioFechamento;
	
	public HorarioDTO() {
	}
	
	public HorarioDTO(Horario horario) {
		setId(horario.getId());
		setDiaSemana(horario.getDiaSemana().getDenominacao());
		setHorarioAbertura(horario.getHorarioAbertura());
		setHorarioFechamento(horario.getHorarioFechamento());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
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
	
	public static class Builder {
		private Horario horario;
		public Builder(HorarioDTO dto) {
			horario = new Horario();
			horario.setDiaSemana(Dia.valueOf(dto.getDiaSemana()));
			horario.setHorarioAbertura(dto.getHorarioAbertura());
			horario.setHorarioFechamento(dto.getHorarioFechamento());
		}
		
		public Horario build() {
			return horario;
		}
	}

}
