package edu.fiu.swimtimer;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class SwimTimer implements SelfCheckCapable {
	private LEDMatrix mainDisplay;
	private Button pushButton;
	
	public SwimTimer() {
		mainDisplay=new LEDMatrix();
		pushButton=new Button();
	}
	
	
	public void ResetTimer() {
		// TODO - implement SwimTimer.ResetTimer
		throw new UnsupportedOperationException();
	}

	public void RunTimer() {
		// TODO - implement SwimTimer.RunTimer
		throw new UnsupportedOperationException();
	}

	public void StopTimer() {
		// TODO - implement SwimTimer.StopTimer
		throw new UnsupportedOperationException();
	}
	
	public static void main(String [] args) {
		SwimTimer myTimer = new SwimTimer();
		myTimer.runSelfCheck();
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My fancy swim timer";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
}
