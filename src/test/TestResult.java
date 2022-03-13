package test;

import domain.Exercise;


public class TestResult {

    public static void main(String[] args) {
        String equation = "1 + 33-4 * 7";
        System.out.println(equation + " = " + Exercise.calculate(equation));
    }
}
