

import Tools.IO.*;                          // Eingaben

public class Spieler {
	
	public static final int rundenzahl = WuerfelSpiele.getRundenanzahl();
	private String name;
	private int [] augen = new int[rundenzahl];
	
	

}
	

	
				Spieler(String name){
						this.name = name;
		
						}
	
				public String getName() {
					return name;
					}

				public void setName(String name) {
					this.name = name;
					}
				
				
				public void addSpieler()
				{
					this.addSpieler(getSpieler);
				}
				
				
