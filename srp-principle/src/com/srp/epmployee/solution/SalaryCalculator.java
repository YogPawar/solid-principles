package com.srp.epmployee.solution;

public class SalaryCalculator {

  public double calculateSalary(Employee employee, int workingDays) {
    return employee.getBaseSalary() * workingDays;
  }

}
