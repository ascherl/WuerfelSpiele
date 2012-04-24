import Tools.IO.*;

public class WuerfelSpielDialog {

public static int rundenanzahl;
private static int anzahl;
private static int variante;


public static int setAnzahl() {
	int anzahl = IOTools.readInteger( "Bitte die gewuenschte Spieleranzahl eingeben!  ");
	return anzahl;
	}

public static int setRundenanzahl() {
	int rundenanzahl = IOTools.readInteger
			( "Bitte die gewuenschte Rundenanzahl eingeben!  ");
	return rundenanzahl;
	}

public static int setVariante() {
	int variante = IOTools.readInteger
				( "Bitte die gewuenschte Variante 1,2 oder 3 eingeben eingeben!  ");
	return variante;
}

public static int getRundenanzahl() {
	return rundenanzahl;

}

public static int getAnzahl() {
	return anzahl;
	}

public static int getVariante() {
	return variante;
}

public static void Auswertung(String name, int ergebnis){
	System.out.println(name + ", Du hast aktuell " + ergebnis + " Punkte!");
}


public static void getSpielregeln() {
	System.out.println( "Mehrere Spieler wuerfeln hintereinander.");
	System.out.println( "Sieger ist der Spieler mit der hoechsten Augensumme.");	
	System.out.println( "1. Variante: Alle Augen werden addiert.");
	System.out.println( "2. Variante: Nur die geraden Augen werden addiert.");
	System.out.println( "3. Variante: Alle Augen werden addiert, wuerfelt man eine Eins, wird die bis dahin erreichte Augensumme wieder geloescht.");
}

}
