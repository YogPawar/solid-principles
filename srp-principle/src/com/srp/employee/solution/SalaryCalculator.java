package com.srp.employee.solution;

public class SalaryCalculator {

  public double calculateSalary(Employee employee, int workingDays) {
    return employee.getBaseSalary() * workingDays;
  }

}
