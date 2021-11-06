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
	public static void systemOn() {
		System.out.println("Lawnmower is ready!");
	} 
	public void systemOff() {
		System.out.println("Lawnmower is not ready!");
	}
	public void moveForward() {
		System.out.println("Lawnmower is moving forward!");
	}
	public void moveBackward() {
		System.out.println("Lawnmower is moving backwards!");
	}
	public void turnRight() {
		System.out.println("Lawnmower turns right!");
	}
	public void turnLeft() {
		System.out.println("Lawnmower turns left!");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lawnmower l = new Lawnmower("iRobot Terra");
		l.systemOn();
		l.systemOff();
		l.moveForward();
		l.moveBackward();
		l.turnRight();
		l.turnLeft();
	
		System.out.println("Let me introduce you to the "+ l +"!");
		
		
	}

}
