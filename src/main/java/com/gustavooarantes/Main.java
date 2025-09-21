package com.gustavooarantes;

import com.gustavooarantes.service.HelloService;
import java.util.Arrays;
import java.util.List;

public class Main {

  // Functional interfaces specifies a single abstract method.
  @FunctionalInterface
  interface MathOperation {
    int operate(int a, int b);
  }

  public static void main(String[] args) {
    /**
     * Expression Lambda: (parameters-list) -> expression;
     *
     * <p>Statement Lambda: (parameters-list) -> {statements;}
     */
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int sumOfSquaredEvens =
        numbers.stream()
            .filter(number -> number % 2 == 0)
            .mapToInt(number -> number * number)
            .sum();

    System.out.println(sumOfSquaredEvens);

    /**
     * Lambdas are like compact representations of an anonymous function (functions that lacks a
     * specific name) that can be easily passed around. It shares common characteristics with
     * methods, such as having parameters, a body, a return type, and the potential for a list of
     * exceptions, although it isn't tied to a particular class. Lambdas can be passed as arguments
     * to a method, or even be stored in a variable.
     */
    HelloService helloService = new HelloService();

    helloService.getUserInfo();
  }

  // Example of simplifying  a method using lambdas:
  // Method (default)
  public int add(int num1, int num2) {
    int result = num1 + num2;
    return result;
  }

  // Statement lambda
  static MathOperation addOperation =
      (num1, num2) -> {
        int result = num1 + num2;
        return result;
      };

  // Expression lambda
  static MathOperation addOperation_ = (a, b) -> a + b;
}
