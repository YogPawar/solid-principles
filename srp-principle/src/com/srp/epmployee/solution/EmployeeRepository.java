package com.srp.epmployee.solution;

public class EmployeeRepository {

  public void saveToDatabase(Employee employee) {
    System.out.println("Saving employee details into DB" + employee.getEmpId());
  }

}
