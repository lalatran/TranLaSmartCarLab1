/**
 * 
 */
package com.smartrfsolutions.companymodel;

/**
 * @author Tran
 *
 */
public abstract class Employee {
	private String name;
	private double yearToDateEarnings;
	
	public abstract double computePay();
}
