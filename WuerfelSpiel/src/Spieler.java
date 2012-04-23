// Spieler.java                                 JG 2012

import Tools.IO.*;                          // Eingaben

/**
 * Spieler fuer ein Würfelspiel.
 */
public class Spieler
{
/* ------------------------------------------------- */
                                           // Attribute


/**
 * Name des Spielers.
 */
  String name = "";



/* ------------------------------------------------- */
                                            // Programm
/**
 * Test der Klasse Spieler
 */
  public static void addSpieler()
  {

                  // Erzeugen eines Feldes von Spielern
    Spieler[] spieler = new Spieler[ WuerfelSpielDialog.setAnzahl()];

  // Bereitstellen des Datenspeichers für jeden Spieler
    for( int i = 0; i < spieler.length; i++)
      spieler[ i] = new Spieler();

                           // Einlesen der Spielerdaten
    for( int i = 0; i < spieler.length; i++)
    {
      System.out.println( "Spieler "+ (i + 1));
      spieler[ i].name
      = IOTools.readLine( "Wie ist Dein Vorname? ");
     
    }

           // Auflisten aller eingelesenen Spielerdaten
    System.out.println( "Es spielen mit: ");
    for( int i = 0; i < spieler.length; i++)
      System.out.println
      ( "Spieler "+ (i + 1) + " " + 
      spieler[ i].name);
  }
}
