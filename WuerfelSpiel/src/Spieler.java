
import Tools.IO.*;                          // Eingaben

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
  private int punkte;
  
  
  public String getName() {
	  return name;
  }
  
  public int wuerfeln( Wuerfel wuerfel)
  {
    return wuerfel.wuerfeln();
  }
  
  public int addPunkte( int punkte)
  {
    this.punkte += punkte;
    return this.punkte;
  }
}







