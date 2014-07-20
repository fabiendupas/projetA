package com.modele.espece;

public abstract class Animal {
	private String nom;

	public abstract void manger();
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
