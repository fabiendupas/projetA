package com.enumeration;

public enum CodeTypeEvenement {

	SPORT("sport"),
	LOISIR("loisir"),
	COURSE("Course");
	
	private String typeEvenement;
	
	CodeTypeEvenement(String type) {
		typeEvenement=type;
	}

	public String getEvenement() {
		return typeEvenement;
	}

	public void setTypeEvenement(String typeEvenement) {
		this.typeEvenement = typeEvenement;
	}

	
}
