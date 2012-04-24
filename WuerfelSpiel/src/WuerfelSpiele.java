import Tools.IO.IOTools;

/**
 * 
 * @author jakob
 * 
 */
public class WuerfelSpiele {

	public static void main ( String[] args) {
		do {
		Wuerfel wuerfel = new Wuerfel();

		WuerfelSpielDialog.getSpielregeln();
		  
		  int variante = WuerfelSpielDialog.setVariante();
		  
	                  // Erzeugen eines Feldes von Spielern
	    Spieler[] spieler = new Spieler[ WuerfelSpielDialog.setAnzahl()];

	  // Bereitstellen des Datenspeichers für jeden Spieler
	    for( int i = 0; i < spieler.length; i++){
	      spieler[ i] = new Spieler();}

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
	    
	    
	    int runden = WuerfelSpielDialog.setRundenanzahl();

	    for( int runde = 0; runde < runden; runde++)
	    {
	      System.out.println( "\nRunde: " + (runde + 1));

	      for( int dran = 0; dran < spieler.length; dran++)
	      {
	        System.out.println();
	        IOTools.readLine( spieler[ dran].getName()
	                          + " wuerfeln (ENTER)");

	        int augen =spieler[ dran].wuerfeln( wuerfel);
	        
	        System.out.println(spieler[ dran].name + " hat " + augen + " gewuerfelt.");
	       
	        
	        spieler[ dran].auswertung(runde, runden, augen, variante);
	        
	      }

	      System.out.println();
	     
	      
	      
	    }
		
	  
	  }while(IOTools.readBoolean("Nochmal Spielen? (true / false) ") == true);
	}
}
