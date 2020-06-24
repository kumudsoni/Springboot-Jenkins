package com.zensar.day1.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;


@Component
public class Employee {

	private int employeeId;
	private String employeeName;
	private String[] nicknames;
	private int salary;
	private List<String> languagesKnown;
	private Set<String> setOfLocationsWorked;
	private Map<String, String> mapOfProgrammingLanguages;
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", nicknames="
				+ Arrays.toString(nicknames) + ", salary=" + salary + ", languagesKnown=" + languagesKnown
				+ ", setOfLocationsWorked=" + setOfLocationsWorked + ", mapOfProgrammingLanguages="
				+ mapOfProgrammingLanguages + "]";
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String[] getNicknames() {
		return nicknames;
	}


	public void setNicknames(String[] nicknames) {
		this.nicknames = nicknames;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public List<String> getLanguagesKnown() {
		return languagesKnown;
	}


	public void setLanguagesKnown(List<String> languagesKnown) {
		this.languagesKnown = languagesKnown;
	}


	public Set<String> getSetOfLocationsWorked() {
		return setOfLocationsWorked;
	}


	public void setSetOfLocationsWorked(Set<String> setOfLocationsWorked) {
		this.setOfLocationsWorked = setOfLocationsWorked;
	}


	public Map<String, String> getMapOfProgrammingLanguages() {
		return mapOfProgrammingLanguages;
	}


	public void setMapOfProgrammingLanguages(Map<String, String> mapOfProgrammingLanguages) {
		this.mapOfProgrammingLanguages = mapOfProgrammingLanguages;
	}
	
	

	
}
