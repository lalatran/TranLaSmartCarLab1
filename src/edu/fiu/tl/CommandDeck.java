/**
 * 
 */
package edu.fiu.tl;

/**
 * @author Tran
 *
 */
public class CommandDeck {

	private String deckMaterial;
	private String deckType;
	private double deckLength;
	private double deckWidth;
	private double deckHeight;
	
	public CommandDeck( String dt, String dm) {
		deckType=dt;
		deckMaterial=dm;
	}
	public void setDimensions(double length, double width, double height) {
		deckLength=length;
		deckWidth=width;
		deckHeight=height;
	}
	public void printDeck() {
		System.out.println("Our command deck is made of "+ deckType+ " " +deckMaterial+".");
	}
}

