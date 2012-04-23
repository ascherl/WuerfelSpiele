import Tools.IO.*;


public class WuerfelSpielDialog {


	
	


	
	
private int anzahl = IOTools.readInteger
				( "Bitte die gewünschte Spieleranzahl eingeben!");
private int rundenanzahl = IOTools.readInteger
				( "Bitte die gewünschte Rundenanzahl eingeben!");
private int variante = IOTools.readInteger
 				( "Bitte die gewünschte Variante 1,2 oder 3 eingeben eingeben!");

public String [] Spieler = new String[anzahl];

		


public static int getAnzahl() {
	int anzahl = IOTools.readInteger( "Bitte die gewünschte Spieleranzahl eingeben!");
	return anzahl;
	}

public int getRundenanzahl() {
	return rundenanzahl;
	}

public int getVariante() {
	return variante;
	
	}

public static void getSpielregeln() {
	System.out.println( "Mehrere Spieler würfeln hintereinander.");
	System.out.println( " Sieger ist der Spieler mit der hoechsten Augensumme.");	
	System.out.println( "1. Variante: Alle Augen werden addiert.");
	System.out.println( "2. Variante: Nur die geraden Augen werden addiert.");
	System.out.println ( "3. Variante: Alle Augen werden addiert, würfelt man eine Eins, wird die bis dahin erreichte Augensumme wieder gelöscht.");
}

}
