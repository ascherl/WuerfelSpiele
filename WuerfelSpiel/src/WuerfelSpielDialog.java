import Tools.IO.*;

public class WuerfelSpielDialog {

public static int rundenanzahl;
private static int anzahl;
private static int variante;

/**
 * Fragt die Spieleranzahl vom Benutzer ab.
 * @return
 */
public static int setAnzahl() {
	int anzahl = IOTools.readInteger( "Bitte die gewuenschte Spieleranzahl eingeben!  ");
	return anzahl;
	}

/**
 * Fragt die Rundenanzahl vom Benutzer ab.
 * @return
 */
public static int setRundenanzahl() {
	int rundenanzahl = IOTools.readInteger
			( "Bitte die gewuenschte Rundenanzahl eingeben!  ");
	return rundenanzahl;
	}

/**
 * Fragt die Variante vom Benutzer ab.
 * @return
 */
public static int setVariante() {
	int variante = IOTools.readInteger
				( "Bitte die gewuenschte Variante 1,2 oder 3 eingeben eingeben!  ");
	return variante;
}

/**
 * Gibt die Rundenanzahl aus.
 * @return Rundenanzahl
 */
public static int getRundenanzahl() {
	return rundenanzahl;

}

/**
 * Gibt die Spieleranzahl aus.
 * @return Spieleranzahl
 */
public static int getAnzahl() {
	return anzahl;
	}

/**
 * Gibt die gewŠhlte Variante aus.
 * @return Variante
 */
public static int getVariante() {
	return variante;
}

/**
 * Ausgabe von Spieler.auswertung
 * @param name Spielername
 * @param ergebnis Gesamtpunktzahl nach Auswertung
 */
public static void Auswertung(String name, int ergebnis){
	System.out.println(name + ", Du hast aktuell " + ergebnis + " Punkte!");
}

/**
 * Gibt die Spielregeln aus.
 */
public static void getSpielregeln() {
	System.out.println( "Mehrere Spieler wuerfeln hintereinander.");
	System.out.println( "Sieger ist der Spieler mit der hoechsten Augensumme.");	
	System.out.println( "1. Variante: Alle Augen werden addiert.");
	System.out.println( "2. Variante: Nur die geraden Augen werden addiert.");
	System.out.println( "3. Variante: Alle Augen werden addiert, wuerfelt man eine Eins, wird die bis dahin erreichte Augensumme wieder geloescht.");
}

}
