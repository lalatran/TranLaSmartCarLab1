/**
 * 
 */
package edu.fiu.tl;

/**
 * @author Tran
 *
 */
public class CameraSensor extends Sensor {

	private int focalLength;
	private String lenseType;
	
	public boolean detectObstaclePresence(boolean yes) {
		return yes;
	}
	public void startCapture() {
		System.out.println("Recording begins.");
	}
	public void stopCapture() {
		System.out.println("Recording stops.");
	}
}

