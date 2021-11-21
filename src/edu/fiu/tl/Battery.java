/**
 * 
 */
package edu.fiu.tl;

/**
 * @author Tran
 *
 */
public class Battery {

	//batteryType: lithium-ion, lead acid
	private String batteryType;
	//batteryCapacity: 10 Ah, 20 Ah
	private double batteryCapacity;
	//runTime: 270 min
	private int runTime;
	//voltage: 20 volts, 40 volts, etc.
	private int voltage;
	private double weight;
	
	public Battery(String myBatteryType, int myVoltage, double myWeight) {
		batteryType= myBatteryType;
		voltage=myVoltage;
		weight=myWeight;
	}
	public void setCapacity(double myBatteryCapacity, int myRunTime) {
		batteryCapacity=myBatteryCapacity;
		runTime=myRunTime;
	}
	public void printBattery() {
		System.out.println("Our mower is equipped with a "+ batteryType +" battery that weighs "+ weight +" lbs and a voltage of "+ voltage + "V.");
		System.out.println("With a capacity of "+ batteryCapacity +" Ah, our battery can run for "+runTime+" min.");
	}
/** charge is a method that adds to the power
 * 	of the lawn mower.
 */
	public void charge() {
		System.out.println("Mower is charging.");
	}
	public void getPowerPercentage() {
		System.out.println("Battery is at 50%");
	}
}
