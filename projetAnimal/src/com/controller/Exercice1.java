package com.controller;

import com.modele.espece.Animal;
import com.modele.espece.organisme.vertebre.mammifere.Homme;

class Exercice1 {

	public static void main(String[] argv){
		Homme bill = new Homme("Bill", false);
		bill.remuerVertebres();
		bill.allaiter();
		bill.ecrire();
	 	
	}
}
