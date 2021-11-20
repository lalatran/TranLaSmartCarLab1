/**
 * 
 */
package edu.fiu.twofactor;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author Tran
 *
 */
public class SSOServer implements SelfCheckCapable {
	private DuoApp duoapp;
	
	public SSOServer() {
		duoapp= new DuoApp();
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "FIU SSO Server";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
