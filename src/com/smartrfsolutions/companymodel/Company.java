/**
 * 
 */
package com.smartrfsolutions.companymodel;

/**
 * @author Tran
 * created on October 30, 2021 in class
 */
public class Company {

	private String companyName;
	private Employee[] myEmployees;
	
	public Company(String name) {
		this.companyName = name;
		myEmployees=new Employee[10];
	}
	
	public int numberOfEmployees() {
		return myEmployees.length;
		
	}
	
	public String toString() {
		return companyName;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company mycompany = new Company("SmartRF Solutions");
		
		System.out.println("New company: " + mycompany);
		System.out.println("Number of employees: " + mycompany.numberOfEmployees());
	}

}
