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
public class CameraSensor extends Sensor implements SelfCheckCapable {

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
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My camera sensor";
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

