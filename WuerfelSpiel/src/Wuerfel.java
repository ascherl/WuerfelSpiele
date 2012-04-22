// Wuerfel.java                                 MM 2010
 
/**
 * Wuerfel min ... max.
 */
public class Wuerfel
{
/* ------------------------------------------------- */
                                           // Attribute
/**
 * Minimale Augenzahl.
 */
  private int min;

/**
 * Maximale Augenzahl.
 */
  private int max;

/**
 * Aktuelle Augenzahl.
 */
  private int augen;

/* ------------------------------------------------- */
                                       // Konstruktoren
/**
 * Kostruktor, erzeugt Wuerfel min .. max.
 * @param min minimale Augenzahl
 * @param max maximale Augenzahl
 */
  public Wuerfel( int min, int max)
  {
    if( max < min)
    {
      this.min = max;                    // vertauschen
      this.max = min;
    }
    else
    {
      this.min = min;
      this.max = max;
    }

    wuerfeln();
  }

/**
 * Kostruktor, erzeugt Standardwuerfel 1 .. 6.
 */
  public Wuerfel()
  {
    this( 1, 6);
  }

/* ------------------------------------------------- */
                                    // toString-Methode
/**
 * Darstellen eines Wuerfels als String der Form
 * "Wuerfel 1 .. 6 gewuerfelt: 3".
 */
  public String toString()
  {
    return "Wuerfel " + min + " .. " + max +
           " Augen: " + augen;
  }

/* ------------------------------------------------- */
                                         // get-Methode
/**
 * Liest aktuelle Augenzahl.
 * @return Augenzahl
 */
  public int getAugen()
  {
    return augen;
  }

/* ------------------------------------------------- */
                                     // service-Methode
/**
 * Wuerfeln, setzt zufällig Augenzahl als
 * ganze Zahl zwischen Minimalzahl und Maximalzahl.
 * @return Augenzahl
 */
  public int wuerfeln()
  {
    augen
    = (int)(Math.random() * ( max - min + 1)) + min;

    return augen;
  }
}
