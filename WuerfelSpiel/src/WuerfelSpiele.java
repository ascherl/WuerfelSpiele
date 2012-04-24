import Tools.IO.IOTools;

/**
 * 
 * @author jakob
 * 
 */
public class WuerfelSpiele {

	public static void main ( String[] args) {
		do {
		Wuerfel wuerfel = new Wuerfel();      // Erzeugen des Objektes wuerfel, aus der Klasse Wuerfel

		WuerfelSpielDialog.getSpielregeln();     // Ausgabe der Spielregeln
		  
		  int variante = WuerfelSpielDialog.setVariante();   // Wahl der Spielvariante
		  
	                  // Erzeugen eines Feldes von Spielern abh�ngig von der Anzahl, die abgefragt wird
	    Spieler[] spieler = new Spieler[ WuerfelSpielDialog.setAnzahl()];

	  // Bereitstellen des Datenspeichers f�r jeden Spieler in Abh�ngigkeit von der gewaehlten Spieleranzahl
	    for( int i = 0; i < spieler.length; i++){
	      spieler[ i] = new Spieler();}

	                           // Einlesen der Spielervornamen
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
	    
	    
	    int runden = WuerfelSpielDialog.setRundenanzahl();  // Festlegen der gewuenschten Rundenanzahl aus der Klasse WuerfelSpielDialog

	    for( int runde = 0; runde < runden; runde++)   // Jeder Spieler wuerfelt und die aktuelle Augenzahl, die Variante, die aktuelle Runde und die Rundenanzahl werden durch eine Methode an Klasse Spieler uerbergeben
	    {
	      System.out.println( "\nRunde: " + (runde + 1));

	      for( int dran = 0; dran < spieler.length; dran++)
	      {
	        System.out.println();
	        IOTools.readLine( spieler[ dran].getName()
	                          + " wuerfeln (ENTER)");

	        int augen =spieler[ dran].wuerfeln( wuerfel);
	        
	        System.out.println(spieler[ dran].name + " hat " + augen + " gewuerfelt.");
	       
	        
	        spieler[ dran].auswertung(runde, runden, augen, variante); // Methode der Klasse Spieler die das Ergebnis in Abh�ngikkeit der Variante auswertet
	        
	      }

	      System.out.println();
	     
	      
	      
	    }
		
	  
	  }while(IOTools.readBoolean("Nochmal Spielen? (true / false) ") == true); // Abfrage ob ein neues Spiel gestartet werden soll
	}
}
