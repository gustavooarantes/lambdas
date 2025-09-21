package com.gustavooarantes.service;

import com.gustavooarantes.common.Hello;
import com.gustavooarantes.common.Pair;
import java.util.Scanner;

public class HelloService implements Hello {

  public void sayHello(String username, int userAge) {
    Hello greeting =
        (name, age) -> System.out.println("Hello " + name + "! You are " + age + " years old.");
    greeting.sayHello(username, userAge); // call the lambda
  }

  public Pair<String, Integer> getUserInfo() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your username below:");
    final String username = scanner.nextLine();

    System.out.println("Enter your age below:");
    final int userAge = scanner.nextInt();

    scanner.close();

    sayHello(username, userAge);

    return new Pair<>(username, userAge);
  }
}
