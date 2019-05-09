package com.shiv.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	private long empId;
	private String ename;
	private String job;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(long empId, String ename, String job, double salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", job=" + job + ", salary=" + salary + "]";
	}

}
