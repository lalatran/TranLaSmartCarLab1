/**
 * 
 */
package edu.fiu.tl;

/**
 * @author Tran
 *
 */
public abstract class Sensor {

	private String type;
	private String model;
	private String manufacturer;
	private String description;
	
	public void autoSense() {
		System.out.println("Sensors activated.");
	}
	public void sendSignal() {
		System.out.println("Signals sending...");
	}
	public void alertUser() {
		System.out.println("WARNING! I sense an obstacle!");
	}
}
