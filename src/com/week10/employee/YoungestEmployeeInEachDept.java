package com.week10.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class YoungestEmployeeInEachDept 
{
	public static void main(String[] args) {
		EmployeeRecords empRecords=new EmployeeRecords();
	    List<Employee>employeeList=empRecords.empRecord();
	    Map<String, Optional<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.
	    		minBy(Comparator.comparing(Employee::getAge))));
	    System.out.println(collect);
	    
	}

			

			 

			
}
