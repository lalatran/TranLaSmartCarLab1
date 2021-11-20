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
public class Site implements SelfCheckCapable{

	private String url;
	private SSOServer myssoserver;
	
	public Site() {
		url="https://www.fiu.edu";
		myssoserver= new SSOServer();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Site mysite= new Site();
		mysite.runSelfCheck();
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return url;
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, myssoserver);
	}

}
