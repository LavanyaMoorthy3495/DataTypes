package com.employeedetails;

public class EmployeeInfo {
	
	private void empName() {
		
		String s ="BALAJI";
		System.out.println("\tEmpName : "+s);
	}
	private void empId() {
		
		int d=7648;
		System.out.println("\tEmpId :" +d);
	}
	private void compName() {
	
		String c = "TCS";
		System.out.println("\tCompName :"+c);
	}
	private void empGender() {

        char g ='M';
        System.out.println("\tEmpGender : " +g);
	}
	private void empDept() {
		
		String d = "AUTOMATION TESTER"; 
		System.out.println("\tEmpDept : " +d);
	}
	private void empAge() {
		
		byte a = 30;
		System.out.println("\tEmpAge : " +a);
	}
	private void empPhoneNo() {
	
        long p = 75431807530l;
        System.out.println("\tEmpPhoneNo : "+p);
   }
	private void empSalary() {
		
		float f = 6.75f;
		System.out.println("\tEmpSalary(LPA) : " +f);
	}
	private void empWorkExp() {
		
		boolean b = true;
		System.out.println("\tExperienced (F/T) : " +b);
	}
	public static void main(String[] args) {
		
		EmployeeInfo EI = new EmployeeInfo();
		EI.empName();
		EI.empId();
		EI.compName();
		EI.empGender();
		EI.empDept();
		EI.empAge();
		EI.empPhoneNo();
		EI.empSalary();
		EI.empWorkExp();
	}
}
