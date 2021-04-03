package com.lambda;

import com.lambda.domain.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainTestComparatorPrimitivePerformanceUser {

  public static void main(String[] args) {
    User sarah = new User("sarah", 28);
    User aline = new User("aline", 25);
    User joao1 = new User("joao", 50);
    User joao2 = new User("joao", 25);
    User marilene = new User("marilene", 41);
    User tompson = new User("tompson", 50);

    List<User> users = Arrays.asList(sarah, aline, joao1, joao2, marilene, tompson);
    var init = System.currentTimeMillis();
    System.out.println("Starting Comparing!!" + init);

    Comparator<User> testAgeNormal = Comparator.comparing(User::getAge);
    users.sort(testAgeNormal);
    System.out.println(
        "Finished the generic execution in " + (System.currentTimeMillis() - init) + " ms.");

    System.out.println("---");

    users = Arrays.asList(sarah, aline, joao1, joao2, marilene, tompson);
    init = System.currentTimeMillis();

    Comparator<User> testAgeBetter = Comparator.comparingInt(User::getAge);
    users.sort(testAgeBetter);
    System.out.println(
        "Finished the primitive execution in " + (System.currentTimeMillis() - init) + " ms.");
  }
}
