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
	private Engine myEngine;
	private CameraSensor myCam;
	
	public Lawnmower(int year, String myManufacturer, String myModelName,String myColor) {
		modelYear=year;
		manufacturer = myManufacturer;
		modelName = myModelName;
		color=myColor;
		myEngine=new Engine("iRobot", "Electric", 52.3, 89.6, 12);
		myCam=new CameraSensor();
	}

	public void setWeight(double myWeight) {
		weight=myWeight;
	}
	
	public void printMower() {
		System.out.println(modelYear+ " "+ manufacturer + " " + modelName+ " in "+ color);
		System.out.println("Weight: "+ weight + " lbs");

	}

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

		Lawnmower myMower = new Lawnmower(2020,"Husqvarna","Automower","Midnight Black");
		myMower.runSelfCheck();
		System.out.println("Information about my smart mower: ");
		System.out.println();
		myMower.setWeight(98.2);
		myMower.printMower();
		
		CommandDeck myDeck= new CommandDeck("fabricated", "steel");
		myDeck.printDeck();
		
		Button myButton=new Button();
		myButton.pressButton();
		
		myMower.systemOn();
	
		Battery myBattery = new Battery("lithium-ion", 20, 3.2);
		myBattery.charge();
		myBattery.getPowerPercentage();
		myBattery.setCapacity(20, 270);
		myBattery.printBattery();
		
		
		Blade myBlade= new Blade();
		myBlade.autoCut();
		myBlade.stopCutting();
		
		Sensor mySensor = new CameraSensor();
		mySensor.autoSense();
		mySensor.sendSignal();
		mySensor.alertUser();
		
		BoundarySensor myZone = new BoundarySensor(24, "B", 65);
		myZone.printBoundarySensor();
		
		Wheel myWheel1=new Wheel("Rubber");
		myWheel1.setDimensions(13.4, 2.5);
		myWheel1.printWheel();
		
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "my robotic mower" ;
	}
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, myEngine, myCam);
	}

}
