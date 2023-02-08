package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;

public class Satis extends Department{

	@Override
	String getName() {
		
		return "Satis";
	}

	@Override
	List<String> getEmployees() {
		
		return Arrays.asList("s1","s2","s3"); // calisanlar olsun
	}

}
