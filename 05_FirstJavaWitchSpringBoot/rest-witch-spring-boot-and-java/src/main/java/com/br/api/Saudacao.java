package com.br.api;

public class Saudacao {
	
	private final long id;
	private final String contente;
	
	public Saudacao(long id, String contente) {
		super();
		this.id = id;
		this.contente = contente;
	}

	public long getId() {
		return id;
	}

	public String getContente() {
		return contente;
	}

}
