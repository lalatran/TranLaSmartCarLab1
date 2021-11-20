package edu.fiu.tl;

public class BoundarySensor extends Sensor {

	private int boundaryAreaZone;
	private String currentZone;
	private int perimeterWireCoordinates;
	
/** scanArea to determine the perimeterWireCoordinates
 * 
 */
	public void scanArea() {
		System.out.println("Scanning now...");
	}
/** within PerimeterWire is a method that returns a yes or no
 *  result to determine whether or not the lawn mower
 *  is running within the pre-set perimeter wire.
 */
	public boolean withinPerimeterWire(boolean yes) {
		return yes;
	}
/** alertCommandWhenOffWire is method that alerts the command deck
 * 	that our lawn mower has gone off the designated vicinity.
 */
	public void alertCommandWhenOffWire() {
		
	}
}
