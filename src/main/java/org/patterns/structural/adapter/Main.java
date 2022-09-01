package org.patterns.structural.adapter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/
		EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
		populateEmployeeData(classAdapter);
		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
		String card = businessCardDesigner.designCard(classAdapter);
		System.out.println(card);
		
		/** Using Object Adapter **/
		System.out.println("**************************************");
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
		String s = businessCardDesigner.designCard(objectAdapter);
		System.out.println(s);

	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
