package com.example.blog.stackify;


import com.example.blog.*;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class streamDemo {

	@Autowired
	private EmpRespository empRespository;
	
	public static void main(String[] args) {

		Employee[] arrayEmp = { new Employee(1, "avinash", 108987.9), new Employee(1, "sunny", 25.56) };

		
		List<Employee> asList = Arrays.asList(arrayEmp);

		
		double sum = asList.stream().filter(e -> e.getId() == 1).mapToDouble(e -> e.getSalary()).sum();

		
		System.out.println(sum);
	
		
		
		Integer[]  i= {1,2,4};
		
		
		
		

	}

}
