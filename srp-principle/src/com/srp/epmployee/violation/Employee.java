package com.srp.epmployee.violation;

/**
 * Problem with class : 1) 4 Responsibilities (Salary, database, report generation, employee
 * details)
 * <p>
 * if report changes then we will need to changes in this call.
 * <p>
 * In future changes in DB then also changes will be happened in this code.
 */
public class Employee {

  private int empId;
  private String name;
  private double baseSalary;

  public Employee(int empId, String name, double baseSalary) {
    this.empId = empId;
    this.name = name;
    this.baseSalary = baseSalary;
  }

  //business logic
  public double calculateSalary(int workingDays) {
    return baseSalary * workingDays; //variable
  }

  public void saveToDatabase() {
    System.out.println("Saving Employee details into DB");
  }

  public void generateReport() {
    System.out.println("Employee performance report");
  }
}
