

import Tools.IO.*;                          // Eingaben


public class Spieler {
	private String name;
	private int [] augen = new int[rundenanzahl];
	private int anzahl;



	
	public int[] getAugen()
	{
		
	int[]augen = new int [ wuerfel.rundenanzahl];
	for(int i=0; i < wuerfel.rundenanzahl; i++)
		augen[i] = wuerfel[i].getAugen();
	return augen;
	
	}

	{
	
	
	
	for(int i = 0; i<augen.length; i++){
		getAugen = [i];
		
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
				
				
				
				/**
				 * Spieler wuerfelt mit Spielwuerfel.
				 * @param wuerfel Spielwuerfel
				 * @return gewuerfelte Augenzahl
				 */
				  public int wuerfeln( Wuerfel wuerfel)
				  {
				    return wuerfel.wuerfeln();
				  }
}
