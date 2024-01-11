package com.week10.employee;

import java.util.List;

public class EmployeesWhoJoiningAfter2015 {
	public static void main(String[] args) {
		
	EmployeeRecords employeeRecords=new EmployeeRecords();
    List<Employee>employeeList=employeeRecords.empRecord();
    employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName)
    .forEach(System.out::println);

}
}
