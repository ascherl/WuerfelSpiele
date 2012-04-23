
import Tools.IO.*;


public class TestSpiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] spieler = { "Heinz", "Kai-Uwe", "Paul-Werner"};
		
		
		
		Wuerfel wuerfel = new Wuerfel(1,6);
		
		WuerfelSpielDialog.getSpielregeln();
		
		int anzahl = WuerfelSpielDialog.getAnzahl();
		
		System.out.println(anzahl);
		
		int zahl = IOTools.readInteger("Was für eine Zahl? ");
	}

}
