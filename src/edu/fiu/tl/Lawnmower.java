/**
 * 
 */
package edu.fiu.tl;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author Tran
 *
 */
public class Lawnmower implements SelfCheckCapable {
	
/** Attributes for the Lawn mower class
 * 
 */
	private String manufacturer; 
	private String modelName;
	private int modelYear;
	private double weight;
	private String color;
	
	public Lawnmower() {
		manufacturer =new String("Husqvarna");
		modelName = new String("450X Automower");
	}
	
	
/** Methods for the Lawn mower class
 * 
 */
	public void systemOn() {
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

		Lawnmower myMower = new Lawnmower();
		myMower.runSelfCheck();
		
		/** Print statements for Lawn mower class
		Lawnmower l = new Lawnmower("iRobot Terra t7");
		System.out.println("Let me introduce you to the "+ l +"!");
		
		l.systemOn();
		l.systemOff();
		l.moveForward();
		l.moveBackward();
		l.turnRight();
		l.turnLeft();
	
		
		// Print statements for Blade class
		Blade myBlade = new Blade("Carbon Steel");
		System.out.println(l+" uses "+ myBlade+" blades.");
		myBlade.startCutting();
		myBlade.stopCutting();
		*/ 
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My fancy lawn mower" ;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
