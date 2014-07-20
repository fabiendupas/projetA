package com.modele.espece.organisme;

import com.modele.espece.Animal;

public class Vertebre extends Animal{

	private int nbrVertebres;
	
	public void remuerVertebres() {
		System.out.println(this.getNom() + " remue "+nbrVertebres+ "vertebres");
	}

	public int getNbrVertebres() {
		return nbrVertebres;
	}

	public void setNbrVertebres(int nbrVertebres) {
		this.nbrVertebres = nbrVertebres;
	}

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		
	}
	
}
