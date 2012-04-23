import Tools.IO.IOTools;

/**
 * 
 * @author rudi
 * 
 */
public class WuerfelSpiele {

	public static void main(String[] args) {
		
		neuesSpiel();
				
		int runden = WuerfelSpielDialog.getRundenAnzahl();

	    for( int runde = 0; runde < runden; runde++) {
	      System.out.println( "\nRunde: " + (runde + 1));

	      for( int dran = 0; dran < WuerfelSpielDialog.getSpielerAnzahl; dran++)
	      {
	        System.out.println();
	        IOTools.readLine( Spieler.name[ dran].getName + " wuerfeln (ENTER)");

	        Spieler.name[ dran].augen[runde] = new Wuerfel();

	        System.out.println( augen + " -> " + punkte);
	      }

	      System.out.println();
	    }
		
}

	public class wuerfeln {
		
		Wuerfel wuerfel = new Wuerfel();
	}

	public static void neuesSpiel() {
		new Spieler();
		Spieler.addSpieler();
	}
	
}
