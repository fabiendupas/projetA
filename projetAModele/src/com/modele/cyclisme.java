package com.modele;


public class cyclisme extends Activite{

	public static int cadenceMoyenne;
	public static int puissanceMoyenne;

	public static int getCadenceMoyenne() {
		return cadenceMoyenne;
	}

	public static void setCadenceMoyenne(int cadenceMoyenne) {
		cyclisme.cadenceMoyenne = cadenceMoyenne;
	}

	public static int getPuissanceMoyenne() {
		return puissanceMoyenne;
	}

	public static void setPuissanceMoyenne(int puissanceMoyenne) {
		cyclisme.puissanceMoyenne = puissanceMoyenne;
	}
}
