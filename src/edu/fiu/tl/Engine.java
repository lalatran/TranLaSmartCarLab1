/**
 * 
 */
package edu.fiu.tl;

/**
 * @author Tran
 *
 */
public class Engine {

	private String manufacturer;
	private String engineType;
	private double horsepower;
	private double capacity;
	private int numberOfCylinders;
	
	public Engine(String myManufacturer, String myEngineType, double hp, double cap, int cyl) {
		manufacturer=myManufacturer;
		engineType=myEngineType;
		horsepower=hp;
		capacity=cap;
		numberOfCylinders=cyl;
	}
	public void printEngine() {
		System.out.println("");
	}
	public void engineOn() {
		
	}
	public void engineOff() {
		
	}
}
