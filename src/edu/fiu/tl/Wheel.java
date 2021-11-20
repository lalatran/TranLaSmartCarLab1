/**
 * 
 */
package edu.fiu.tl;

/**
 * @author Tran
 *
 */
public class Wheel {

	private String wheelMaterial;
	private double diameter;
	private double width;

	public Wheel(String myWheelMaterial) {
		wheelMaterial = myWheelMaterial;
	}
	public Wheel(double d, double w) {
		diameter = d;
		width= w;
	}
	
	public void setDimensions(double d, double w) {
		diameter = d;
		width = w;
	}
	public void printWheel() {
		System.out.println("Wheel Material: "+ wheelMaterial);
		System.out.println("Wheel Dimensions: "+diameter+","+ width);
	}
	public void rollForward() {
		
	}
	public void rollBackward() {
		
	}
	public void rollLeft() {
		
	}
	public void rollRight() {
		
	}
	public void stopRolling() {
		
	}
}
