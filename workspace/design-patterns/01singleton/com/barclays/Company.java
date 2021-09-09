package com.barclays;

public class Company {
	// lazy singleton 
	private Company() {
		System.out.println("Object creationg - Company");
	}
	
	public static Company getInstance(Company company) {
		if(company == null) {
			return new Company(); 
		}
		return company;
	}
	
}
