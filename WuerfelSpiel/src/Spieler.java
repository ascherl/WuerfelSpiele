
import Tools.IO.*;                          

/**
 * Spieler fuer das Wuerfelspiel.
 */
public class Spieler
{


/**
 * Name des Spielers.
 * 
 * @param name Name des Spielers.
 * @param punkte Feld mit den Punkten des Spielers.
 */
 public String name = "";
 private int[] punkte = new int[100000]; //Begrenzung der Rundenzahl auf 100000 <- egtl. sollte hier die Runzenzahl rein.

/**
 * Liefert das Punktefeld des Spielers
 * @return Punktefeld
 */
public int[] getPunkte() {
	return this.punkte;
 }


/**
 * Wertet gesamtes Punktfeld entsprechend der drei Varianten aus.
 * @param runde aktuelle Runde
 * @param runden Rundenzahl
 * @param augen zuletzt gew�rfelte Augenanzahl
 * @param variante gew�hlte Variante
 */
public void auswertung(int runde, int runden, int augen, int variante) {
	this.punkte[runde] = augen; // aktuelle Augenzahl wird in das Punktefeld eingetragen
	int ergebnis = 0;
	switch(variante) {
	case 1: // Aufsummieren der Punkte �ber das Punktfeld
		for(int i=0; i<=runde; i++) {
			ergebnis += this.punkte[i];
		}
		break;
	case 2: // Aufsumieren aller geraden Punkte �ber das Punktfeld
		for(int i=0; i<=runde; i++) {
			if( this.punkte[i] % 2 == 0 ) ergebnis += this.punkte[i];
		}
		break;
	case 3: // Wenn zuletzt gew�rftele Zahl = 1, dann alle Punkte im Feld <- 0
		if( this.punkte[runde] == 1 ) { // wenn zuletzt eine 1 gew�rfelt wurde
			for (int j=0; j<=runde; j++) { // Punktfeld durchlaufen und <- 0
				this.punkte[j] = 0;
			}
			ergebnis = 0; // Als letztes evaluieren �
			System.out.println("Die   B - � - S - E   Eins!");
		}
		for(int i=0; i<=runde; i++) { //ansonsten aufsummieren
			ergebnis += this.punkte[i];
		}
		break;
	}
	WuerfelSpielDialog.Auswertung(this.name, ergebnis); // �bergibt Name und Ergebnis an Dialog
}
 
 /**
  * Liefert namen des Spielers zur�ck.
  * @return Name des Spielers
  */
  public String getName() {
	  return this.name;
  }
 
 /**
  * W�rfelt mit einem Objekt W�rfel, der von WuerfelSpiele erzeugt wird. 
  * @param wuerfel
  * @return gew�rfelte Augenzahl
  */
  public int wuerfeln( Wuerfel wuerfel)
  {
    return wuerfel.wuerfeln();
  }
  
}