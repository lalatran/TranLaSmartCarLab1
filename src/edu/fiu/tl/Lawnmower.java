/**
 * 
 */
package edu.fiu.tl;

/**
 * @author Tran
 *
 */
public class Lawnmower {
	
/** Attributes for the Lawnmower class
 * 
 */
	private String manufacturer; 
	private String modelName;
	private int modelYear;
	private double weight;
	private String color;
	
	public Lawnmower(String name) {
		this.modelName = name;
	}
	public String toString() {
		return modelName;
	}
	
/** Methods for the Lawnmower class
 * 
 */
	public void systemOn() {
	
	} 
	public void systemOff() {
		
	}
	public void moveForward() {
		
	}
	public void moveBackward() {
		
	}
	public void turnRight() {
		
	}
	public void turnLeft() {
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lawnmower myLawnmower = new Lawnmower("iRobot Terra");
		
		System.out.println("Let me introduce you to the "+ myLawnmower+"!");
	}

}
