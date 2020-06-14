package com.hackaton.bigbino.model;

public enum Dia {
	
	SEGUNDA{
		@Override
		public String getDenominacao() {
			return "SEGUNDA-FEIRA";
		}
	},
	TERCA{
		@Override
		public String getDenominacao() {
			return "TERÇA-FEIRA";
		}
	},
	QUARTA{
		@Override
		public String getDenominacao() {
			return "QUARTA-FEIRA";
		}
	},
	QUINTA{
		@Override
		public String getDenominacao() {
			return "QUINTA-FEIRA";
		}
	},
	SEXTA{
		@Override
		public String getDenominacao() {
			return "SEXTA-FEIRA";
		}
	},
	SABADO{
		@Override
		public String getDenominacao() {
			return "SÁBADO";
		}
	},
	DOMINGO{
		@Override
		public String getDenominacao() {
			return "DOMINGO";
		}
	};
	
	public abstract String getDenominacao();

}
