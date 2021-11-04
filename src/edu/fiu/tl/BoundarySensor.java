package edu.fiu.tl;

public class BoundarySensor extends Sensor {

	private int boundaryAreaZone;
	private String currentZone;
	private int perimeterWireCoordinates;
	
	public void scanArea() {
		
	}
	public boolean withinPerimeterWire(boolean yes) {
		return yes;
	}
	public void alertCommandWhenOffWire() {
		
	}
}
