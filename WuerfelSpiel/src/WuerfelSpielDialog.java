import Tools.IO.*;

public class WuerfelSpielDialog {


public static int getAnzahl() {
	int anzahl = IOTools.readInteger( "Bitte die gewuenschte Spieleranzahl eingeben!  ");
	return anzahl;
	}

public static int getRundenanzahl() {
	int rundenanzahl = IOTools.readInteger
			( "Bitte die gewuenschte Rundenanzahl eingeben!  ");
	return rundenanzahl;
	}

public static int getVariante() {
	int variante = IOTools.readInteger
				( "Bitte die gewuenschte Variante 1,2 oder 3 eingeben eingeben!  ");
	return variante;
	
	}

public static int setSpielerNamen {
	for( int i = 0; i < WuerfelSpielDialog.getAnzahl(); i++){
		spieler[ i] = new Spieler();
	}
}

public static void getSpielregeln() {
	System.out.println( "Mehrere Spieler wuerfeln hintereinander.");
	System.out.println( "Sieger ist der Spieler mit der hoechsten Augensumme.");	
	System.out.println( "1. Variante: Alle Augen werden addiert.");
	System.out.println( "2. Variante: Nur die geraden Augen werden addiert.");
	System.out.println( "3. Variante: Alle Augen werden addiert, wuerfelt man eine Eins, wird die bis dahin erreichte Augensumme wieder geloescht.");
}

}
