package StructuralDP.CompositeDP;

import java.util.Arrays;

public class CompositeRunner {

	
	public static void main(String[] args) {
		
		CompositeDemo();

	}
	
	public static void CompositeDemo() {
		
		Department financeDep = new Finans();
		Department SaleDep = new Satis();
		Department ArgeDep = new Arge();
		
		Department regionalDep = new RegionalDepartment(Arrays.asList(financeDep, SaleDep, ArgeDep ));
		
		System.out.println(regionalDep.getName());
		System.out.println("**************");
		System.out.println(regionalDep.getEmployees());
		
		
	}
	
	}


