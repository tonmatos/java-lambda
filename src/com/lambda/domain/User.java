package com.lambda.domain;

public class User {

  private String name;
  private int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("User{");
    sb.append("name='").append(name).append('\'');
    sb.append(", age=").append(age);
    sb.append("}\n");
    return sb.toString();
  }
}
