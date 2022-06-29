package com.cg.program1;

import java.util.HashSet;

public class Program1 extends Employee {
	public static void main(String[] args) {
		HashSet<Employee> act = new HashSet();

		Employee employee1 = new Employee(1, "Nikha", 30000, "Dev");
		Employee employee2 = new Employee(2, "Ram", 20000, "Q/A");
		Employee employee3 = new Employee(3, "Narendra", 30000, "Analyst");
		Employee employee4 = new Employee(4, "Priya", 50000, "Manager");

		act.add(employee1);
		act.add(employee2);
		act.add(employee3);
		act.add(employee4);

		for (Employee emp : act) {
//			System.out.println(emp.id + " " + emp.name + " " + emp.dept + " " + emp.salary);
			emp.displayDetails();
		}
	}
}
