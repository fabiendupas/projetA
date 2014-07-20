package com.enumeration;

public enum CodeTypeNatation {

	BASSIN("Piscine"),
	EAU_LIBRE("Eau libre");
	
	private String typeNatation;
	
	CodeTypeNatation(String type) {
		typeNatation=type;
	}

	public String getTypeNatation() {
		return typeNatation;
	}

	public void setTypeNatation(String typeNatation) {
		this.typeNatation = typeNatation;
	}

	
}
