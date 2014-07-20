package com.modele;

import com.enumeration.CodeTypeNatation;


public class natation extends Activite{

	public static int taillePiscine;
	public static int nbrLongueur;
	public static CodeTypeNatation typeNatation;
	
	public static int getTaillePiscine() {
		return taillePiscine;
	}
	public static void setTaillePiscine(int taillePiscine) {
		natation.taillePiscine = taillePiscine;
	}
	public static int getNbrLongueur() {
		return nbrLongueur;
	}
	public static void setNbrLongueur(int nbrLongueur) {
		natation.nbrLongueur = nbrLongueur;
	}
	public static CodeTypeNatation getTypeNatation() {
		return typeNatation;
	}
	public static void setTypeNatation(CodeTypeNatation typeNatation) {
		natation.typeNatation = typeNatation;
	}
	
	
}
