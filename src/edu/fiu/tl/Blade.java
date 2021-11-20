/**
 * 
 */
package edu.fiu.tl;

/**
 * @author Tran
 *
 */
public class Blade {

	// bladeType: standard, gator, high-lift, low-lift, mulching
	private String bladeType;
	//bladeModel: BD101, BD102, BD103, ...
	private String bladeModel;
	private double cuttingHeight;
	private double cuttingWidth;
	private int maxTorque;
	
	public Blade() {
		this.bladeType = bladeType; 
		this.bladeModel= bladeModel;
	}
	public String toString() {
		return bladeType;
	}
	public String toString1() {
		return bladeModel;
	}
	public void autoCut() {
		System.out.println("Cutting has begun.");
	}
	public void stopCutting() {
		System.out.println("Cutting has stopped.");
	}
	
}
