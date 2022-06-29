package com.cg.program3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose your sorting category");
		System.out.println("1.name  2.id  3.salary   4.department");
		int choose = scanner.nextInt();
		// char choose = scanner.next().charAt(0);
		Set<Employees> s = null;
		if (choose == 1) {
			s = new TreeSet<>(new nameComp());
		} else if (choose == 2) {
			s = new TreeSet<>(new idComp());
		} else if (choose == 3) {
			s = new TreeSet<>(new salComp());
		} else if (choose == 4) {
			s = new TreeSet<>(new depComp());
		}
			
		s.add(new Employees(1, "Pallavi","Devlopment", 100000));
		s.add(new Employees(2,"Vivek", "Dev",80000));
		s.add(new Employees(3,"Saurav", "HR",90000));
		s.add(new Employees(4,"Aditya","Mgmt",88000));
				for (Employees temp : s) {
			System.out.println(temp);

		}
	}
}