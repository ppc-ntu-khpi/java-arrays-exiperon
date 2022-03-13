package test;

import domain.Exercise;

import java.util.Arrays;

public class TestResult {

    public static void main(String[] args) {
        char[] equation = "1 + 33-4 * 7".toCharArray();
        System.out.println(Arrays.toString(equation) + " = " + Exercise.calculate(equation));
    }
}
