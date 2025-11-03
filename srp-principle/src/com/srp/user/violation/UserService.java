package com.srp.user.violation;

/**
 * Handling both login and logging activity which is violating SRP
 */
public class UserService {

  void login(String userName, String password) {
    System.out.println("User has logged in " + userName);
  }

  void logUserActivity(String user) {
    System.out.println("Logged Activity for User " + user);
  }
}
