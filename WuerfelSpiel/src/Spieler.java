
import Tools.IO.*;                          

/**
 * Spieler fuer ein Wuerfelspiel.
 */
public class Spieler
{
/* ------------------------------------------------- */
                                           // Attribute


/**
 * Name des Spielers.
 */
 public String name = "";
 private int[] punkte = new int[100000];
 
public int[] getPunkte() {
	return this.punkte;
 }



public void auswertung(int runde, int runden, int augen, int variante) {
	this.punkte[runde] = augen;
	int ergebnis = 0;
	switch(variante) {
	case 1:
		for(int i=0; i<=runde; i++) {
			ergebnis += this.punkte[i];
		}
		break;
	case 2:
		for(int i=0; i<=runde; i++) {
			if( this.punkte[i] % 2 == 0 ) ergebnis += this.punkte[i];
		}
		break;
	case 3:
		for(int i=0; i<=runde; i++) {
			ergebnis += this.punkte[i];
			if( this.punkte[i] == 1 ) {
				for (int j=0; j<=runde; j++) {
					this.punkte[j] = 0;
				}
				ergebnis = 0;
				System.out.println("Die   B - … - S - E   Eins!");
			}
		}
		break;
	}
	WuerfelSpielDialog.Auswertung(this.name, ergebnis);
}
 
 
  public String getName() {
	  return name;
  }
  
  public int wuerfeln( Wuerfel wuerfel)
  {
    return wuerfel.wuerfeln();
  }
  
  public int addPunkte( int punkte)
  {
    this.punkte[1] += punkte;
    return this.punkte[1];
  }
}







