// Spieler.java                                 MM 2011

/**
 * Spieler fuer ein Wuerfelspiel.
 */
public class Spieler
{
/* ------------------------------------------------- */
                                           // Attribute
/**
 * Vorname des Spielers.
 */ 
  private String vorName;

/**
 * Anzahl der Punkte im aktuellen Spiel.
 */
  private int punkte;

/* ------------------------------------------------- */
                                         // Konstruktor
/**
 * Konstruktor, setzt Vornamen und Punkte.
 */
  public Spieler( String vorName, int punkte)
  {
    this.vorName = vorName;
    this.punkte = punkte;
  }

/**
 * Konstruktor, setzt  Vornamen.
 */
  public Spieler( String vorName)
  {
    this( vorName, 0);
  }

/**
 * Konstruktor, erstellt Kopie eines Spielers.
 */
  public Spieler( Spieler s)
  {
    this( s.getVorName(), s.getPunkte());
  }

/* ------------------------------------------------- */
                                        // get-Methoden
/**
 * Liest den Vorname des Spielers.
 * @return Vorname
 */
  public String getVorName()
  {
    return vorName;
  }

/**
 * Liest die Anzahl der Punkte im aktuellen Spiel.
 * @return Punkte
 */
  public int getPunkte()
  {
    return punkte;
  }

/* ------------------------------------------------- */
                                    // service-Methoden
/**
 * Addiert Punkte.
 * @param punkte gewonnene Punkte
 * @return Anzahl der Punkte im aktuellen Spiel
 */
  public int addPunkte( int punkte)
  {
    this.punkte += punkte;
    return this.punkte;
  }

/**
 * Zuruecksetzen der Punkte.
 */
  public void reset()
  {
    punkte = 0;
  }

/**
 * Spieler wuerfelt mit Spielwuerfel.
 * @param wuerfel Spielwuerfel
 * @return gewuerfelte Augenzahl
 */
  public int wuerfeln( Wuerfel wuerfel)
  {
    return wuerfel.wuerfeln();
  }

/**
 * Spielerdaten, Vorname und Punkte, als String.
 * @return Vorname und Anzahl der Punkte
 */
  public String toString()
  {
    return vorName + ":\t" + punkte + " Punkte.";
  }
}
