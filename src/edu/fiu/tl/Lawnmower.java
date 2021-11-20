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
	
	/** public Lawnmower() {
		manufacturer =new String("Husqvarna");
		modelName = new String("450X Automower");
	}
	*/
	public Lawnmower(String myManufacturer, String myModelName,String myColor) {
		manufacturer = myManufacturer;
		modelName = myModelName;
		color=myColor;
	}

	public void setWeight(int year, double myWeight) {
		modelYear=year;
		weight=myWeight;
	}
	
	public void printMower() {
		System.out.println("Manufacturer: "+ manufacturer);
		System.out.println("Name: "+ modelName);
	}

	/**public void setWeight(double mowerWeight) {
		weight=mowerWeight;
	}
	public void printMowerDetails() {
		System.out.println("modelName");
	}
	*/
/** Methods for the Lawn mower class */
	public void systemOn() {
		System.out.println("Lawnmower is ready!");
	} 
	public void systemOff() {
		System.out.println("Lawnmower is not ready!");
	}
	public void motionToLawn() {
		System.out.println("Lawnmower is moving forward!");
	}
	public void turnPath() {
		System.out.println("Lawnmower turns!");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lawnmower myMower = new Lawnmower("Husqvarna","Automower","Midnight Black");
		myMower.printMower();
		myMower.setWeight(2020, 98);
		myMower.runSelfCheck();
		
		Button myButton=new Button();
		myButton.pressButton();
		
		
		myMower.systemOn();
	
		Battery myBattery = new Battery();
		myBattery.charge();
		myBattery.getPowerPercentage();
		
		Blade myBlade= new Blade();
		myBlade.autoCut();
		myBlade.stopCutting();
		
		Sensor mySensor = new CameraSensor();
		mySensor.autoSense();
		mySensor.sendSignal();
		mySensor.alertUser();
		
		Wheel myWheel1=new Wheel("Rubber");
		myWheel1.setDimensions(13.4, 2.5);
		myWheel1.printWheel();
		
		
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
