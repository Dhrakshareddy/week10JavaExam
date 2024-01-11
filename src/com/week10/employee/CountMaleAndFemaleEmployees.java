package com.week10.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class CountMaleAndFemaleEmployees
{
	
	public static void main(String[] args) {
		EmployeeRecords empRecords=new EmployeeRecords();
	    List<Employee>employeeList=empRecords.empRecord();
	
		Map<String,Long>maleAndFemaleCount=employeeList.stream().collect
				(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(maleAndFemaleCount);
		
		
	}

}
