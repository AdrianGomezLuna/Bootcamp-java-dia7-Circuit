package com.nttdata.circuitBreaker.model;

public class Circuit {

	private Integer nIntentos;
	private Integer nFallos;
	private Double limiteError;
	private Integer nIntentosMax;
	private Integer nIntentosActual;
	
	
	public Circuit() { }

	public Circuit(Integer nIntentos, Integer nFallos, Double limiteError, Integer nIntentosMax, Integer nIntentosActual) {
		this.nIntentos = nIntentos;
		this.nFallos = nFallos;
		this.limiteError = limiteError;
		this.nIntentosMax = nIntentosMax;
		this.nIntentosActual = nIntentosActual;
	}
	
	public String getEstado() {
		Integer nTotal =  nFallos + nIntentos;
		Double fallos = (double) ((nFallos*100) / nTotal);
		if(fallos>=limiteError)
			if(nIntentosActual<nIntentosMax)
				return "Half-open";
			else
				return "open";		
		return "close";
	}
	
}
