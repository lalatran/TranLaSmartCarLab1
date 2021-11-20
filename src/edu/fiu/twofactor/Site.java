/**
 * 
 */
package edu.fiu.twofactor;

/**
 * @author Tran
 *
 */
public class Site {

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

	}

}
