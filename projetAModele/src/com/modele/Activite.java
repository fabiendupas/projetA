package com.modele;

import java.sql.Date;

import com.enumeration.CodeTypeEvenement;

public class Activite {

	public static Date dateActivite;
	public static Date dureeActivite;
	public static int vitesseMoyenne;
	public static CodeTypeEvenement typeEvenement;
	
	public static Date getDateActivite() {
		return dateActivite;
	}
	
	public static void setDateActivite(Date dateActivite) {
		Activite.dateActivite = dateActivite;
	}
	
	public static Date getDureeActivite() {
		return dureeActivite;
	}
	
	public static void setDureeActivite(Date dureeActivite) {
		Activite.dureeActivite = dureeActivite;
	}
	
	public static int getVitesseMoyenne() {
		return vitesseMoyenne;
	}
	
	public static void setVitesseMoyenne(int vitesseMoyenne) {
		Activite.vitesseMoyenne = vitesseMoyenne;
	}

	public static CodeTypeEvenement getTypeEvenement() {
		return typeEvenement;
	}

	public static void setTypeEvenement(CodeTypeEvenement typeEvenement) {
		Activite.typeEvenement = typeEvenement;
	}
	
}
