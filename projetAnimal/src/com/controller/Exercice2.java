package com.controller;

import com.modele.espece.Animal;
import com.modele.espece.organisme.vertebre.mammifere.Homme;

class Exercice2 {
	public static void main2( String[] argv ){
		//Classe abstraite - polymorphisme
		Animal bill = new Homme("Bill", false);

		bill.manger();
	}
}
