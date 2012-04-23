
import Tools.IO.*;


public class TestSpiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] spieler = { "Heinz", "Kai-Uwe", "Paul-Werner"};
		
	//	for(int i=0; i <spieler.length; i++){
	//	}
		
		WuerfelSpielDialog.getSpielregeln();
		
		final int anzahl = WuerfelSpielDialog.getAnzahl();
		
		final int rundenanzahl = WuerfelSpielDialog.getRundenanzahl();
		
		final int variante = WuerfelSpielDialog.getVariante();
		
		
		System.out.println(anzahl);
		
		int zahl = IOTools.readInteger("Was fŸr eine Zahl? ");
	}

}
