
public class WuerfelSpielDialog {

	public String [] Spieler = new String[anzahl];
	

System.out.println( "Mehrere Spieler w�rfeln hintereinander. Sieger ist der Spieler mit der h�chsten Augensumme. 1. Variante: Alle Augen werden addiert. 2. Variante: Nur die geraden Augen werden addiert. 3. Variante: Alle Augen werden addiert, w�rfelt man eine Eins, wird die bis dahin erreichte Augensumme wieder gel�scht.");
	
	
	
private int anzahl = IOTools.readInteger
				( "Bitte die gew�nschte Spieleranzahl eingeben!");
private int rundenanzahl = IOTools.readInteger
				( "Bitte die gew�nschte Rundenanzahl eingeben!");
private int variante = IOTools.readInteger
 				( "Bitte die gew�nschte Variante 1,2 oder 3 eingeben eingeben!");


if (variante != 1 || variante != 2 || variante != 3)
		{
		int variante = IOTools.readInteger
				( "Bitte die gew�nschte Variante 1,2 oder 3 eingeben eingeben!");
		}


public int getAnzahl() {
	return anzahl;
	}

public int getRundenanzahl() {
	return rundenanzahl;
	}

public int getVariante() {
	return variante;
	}


}
