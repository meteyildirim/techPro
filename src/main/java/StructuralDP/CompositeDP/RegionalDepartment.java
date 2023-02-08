package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department {

	List<Department> childDepartments;
	
	
	
	public RegionalDepartment(List<Department> childDepartments) {
		
		this.childDepartments = childDepartments;
	}

	@Override
	String getName() {	
		
		return childDepartments.stream().// listeden objeleri al
				map(Department::getName ).// finans ve satis isimlerini al
				collect(Collectors.joining(", "));// stringe cevir
		// bunu for loop ilede yapabilirsin..
		
	}

	@Override
	List<String> getEmployees() {
		
		return childDepartments.stream().
				flatMap(d -> d.getEmployees().stream()).
				collect(Collectors.toList());
		// yukaridaki gibide yazilabilir
	}

}
