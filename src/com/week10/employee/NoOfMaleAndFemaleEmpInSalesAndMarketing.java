package com.week10.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoOfMaleAndFemaleEmpInSalesAndMarketing {
	public static void main(String[] args) {
		EmployeeRecords emprecords=new EmployeeRecords();
	    List<Employee>employeeList=emprecords.empRecord();
	    
	    Map<String, Long> MaleAndFemaleEmployeesInMarketing=employeeList.stream()
                .filter(e -> e.getDepartment()=="Marketing").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

	    		System.out.println(MaleAndFemaleEmployeesInMarketing);
	    Map<String, Long> MaleAndFemaleEmployeesInSales=employeeList.stream()
	    	                .filter(e -> e.getDepartment()=="Sales").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

	    		    		System.out.println(MaleAndFemaleEmployeesInMarketing);
	}

}
