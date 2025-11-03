package com.srp.employee.solution;

public class Employee {

  private int empId;
  private String name;
  private double baseSalary;

  Employee(int empId, String name, double baseSalary) {
    this.empId = empId;
    this.name = name;
    this.baseSalary = baseSalary;
  }

  public String getName() {
    return name;
  }

  public double getBaseSalary() {
    return baseSalary;
  }

  public int getEmpId() {
    return empId;
  }
}
