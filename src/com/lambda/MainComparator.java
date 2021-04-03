package com.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainComparator {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Joao", "Aline", "Bob", "Natalia", "Marilene");

    Comparator<String> nameComparator = String::compareTo;
    names.sort(nameComparator);

    Comparator<String> nameLenghtComparator =
        (name1, name2) -> Integer.compare(name1.length(), name2.length());
    Comparator<String> nameLenghtComparatorEasy = Comparator.comparingInt(String::length);
    names.sort(nameLenghtComparatorEasy);

    System.out.println("Names: \n " + names.toString());
  }
}
