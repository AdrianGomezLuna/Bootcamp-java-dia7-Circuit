package com.nttdata.circuitBreaker.model;

public class Circuit {

	private Double nIntentos;
	private Double nFallos;
	private Double limiteError;
	
	public Circuit() { }

	public Circuit(Double nIntentos, Double nFallos, Double limiteError) {
		this.nIntentos = nIntentos;
		this.nFallos = nFallos;
		this.limiteError = limiteError;
	}
	
	public String getEstado() {
		Double nTotal = nFallos + nIntentos;
		Double fallos = (nFallos*100) / nTotal;
		if(fallos>=limiteError)
			return "open";
		
		return "close";
	}
	
}
