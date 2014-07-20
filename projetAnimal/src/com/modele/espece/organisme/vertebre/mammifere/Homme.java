package com.modele.espece.organisme.vertebre.mammifere;

import com.modele.espece.organisme.vertebre.Mammifere;

public class Homme extends Mammifere {

	private static boolean droitier;
	
	public Homme(String unNom, boolean isDroitier){
		this.setNbrVertebres(50);
		this.setNom(unNom);
		droitier = isDroitier;
	}

	public void ecrire() {
		if(droitier){
			System.out.println("Ecrit main droite");
		}else{
			System.out.println("Ecrit main gauche");	
		}
	}
}
