package com.example.demo;

public class pcSelezionati extends pc{
	public int qnt;

	public pcSelezionati(String nome, String marca, String descrizione, double prezzo, String url, int qnt) {
		super(nome, marca, descrizione, prezzo, url);
	     this.qnt=qnt;
		
	}

	@Override
	public String toString() {
		return "pcSelezionati [qnt=" + qnt + "]";
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	

}
