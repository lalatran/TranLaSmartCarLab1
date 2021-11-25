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
public class Engine implements SelfCheckCapable {

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
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Mower's Engine";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}
}
