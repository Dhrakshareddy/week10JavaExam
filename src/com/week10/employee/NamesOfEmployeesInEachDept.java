package com.week10.employee;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class NamesOfEmployeesInEachDept
{
	public static void main(String[] args) {
		EmployeeRecords empRecords=new EmployeeRecords();
	    List<Employee>employeeList=empRecords.empRecord();
	    
	  Map<String,List<Employee>>employeee=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	  Set<Entry<String,List<Employee>>>set=employeee.entrySet();
	  for(Entry<String,List<Employee>>entry:set) {
		  System.out.println("Employees In "+entry.getKey() + " : ");

			List<Employee> list = entry.getValue();
			for (Employee e1 : list)
			{

			System.out.println(e1.getName());

			}

		}
		  
	  }
	

}
