import Tools.IO.*;


public class WuerfelSpielDialog {


	
	


	
	
private int anzahl = IOTools.readInteger
				( "Bitte die gew�nschte Spieleranzahl eingeben!");
private int rundenanzahl = IOTools.readInteger
				( "Bitte die gew�nschte Rundenanzahl eingeben!");
private int variante = IOTools.readInteger
 				( "Bitte die gew�nschte Variante 1,2 oder 3 eingeben eingeben!");

public String [] Spieler = new String[anzahl];

		


public static int getAnzahl() {
	int anzahl = IOTools.readInteger( "Bitte die gew�nschte Spieleranzahl eingeben!");
	return anzahl;
	}

public int getRundenanzahl() {
	return rundenanzahl;
	}

public int getVariante() {
	return variante;
	
	}

public static void getSpielregeln() {
	System.out.println( "Mehrere Spieler w�rfeln hintereinander.");
	System.out.println( " Sieger ist der Spieler mit der hoechsten Augensumme.");	
	System.out.println( "1. Variante: Alle Augen werden addiert.");
	System.out.println( "2. Variante: Nur die geraden Augen werden addiert.");
	System.out.println ( "3. Variante: Alle Augen werden addiert, w�rfelt man eine Eins, wird die bis dahin erreichte Augensumme wieder gel�scht.");
}

}
