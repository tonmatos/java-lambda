package com.lambda;

import java.util.function.Predicate;

public class MainPredicate {

  public static void main(String[] args) {
    Predicate<String> isNotNullPredicate = s -> !(s == null);
    Predicate<String> isNotEmptyPredicate = s -> !(s.isEmpty());

    Predicate<String> isNotNullOrEmpty = isNotNullPredicate.and(isNotEmptyPredicate);

    System.out.println("is NOT null: 'ae'? " + isNotNullPredicate.test("ae"));
    System.out.println("is null: null? " + isNotNullPredicate.test(null));
    System.out.println("is NOT null: ''? " + isNotNullPredicate.test(""));

    System.out.println();

    System.out.println("is NOT empty: 'ae' " + isNotEmptyPredicate.test("ae"));
    System.out.println("is NOT empty: '' " + isNotEmptyPredicate.test(""));

    System.out.println();

    System.out.println("is NOT null and Not Empty: 'ae' " + isNotNullOrEmpty.test("ae"));
    System.out.println("is NOT null and Not Empty: null " + isNotNullOrEmpty.test(null));
    System.out.println("is NOT null and Not Empty: '' " + isNotNullOrEmpty.test(""));
  }
}
