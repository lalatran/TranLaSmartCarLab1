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
	
	public void protectUserFromDebris() {
		
	}
	
	public void turnOn() {
		System.out.println("Command is active");
	}
	public void turnOff() {
		System.out.println("Command is non-active");
	}
}

