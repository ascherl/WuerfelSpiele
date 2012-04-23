// MitSpielerTest.java                          MM 2011

import Tools.IO.*;                          // Eingaben

/**
 * Test der Klasse MitSpieler,
 * 3 Spieler wuerfeln 3x mit einem Standardwuerfel.
 */
public class MitSpielerTest
{
/**
 * Testprogramm.
 */
  public static void main( String[] args)
  {
// Objekte erzeugen
    Spieler[] spieler = new Spieler[ 3];
    spieler[ 0] = new Spieler( "Anna");
    spieler[ 1] = new Spieler( "Bert");
    spieler[ 2] = new Spieler( "Otto");

    MitSpieler mitSpieler = new MitSpieler( spieler);
    Wuerfel wuerfel = new Wuerfel();

// Wuerfeln
    int runden = getRundenAnzahl();

    for( int runde = 0; runde < runden; runde++)
    {
      System.out.println( "\nRunde: " + (runde + 1));

      for( int dran = 0; dran < spieler.length; dran++)
      {
        System.out.println();
        IOTools.readLine( spieler[ dran].getVorName()
                          + " wuerfeln (ENTER)");

        int augen = spieler[ dran].wuerfeln( wuerfel);
        int punkte = spieler[ dran].addPunkte( augen);

        System.out.println( augen + " -> " + punkte);
      }

      System.out.println();
    }

// Auswertung
    System.out.println( "\nSieger:");
    System.out.println( mitSpieler.sortPunkte());
  }
}
