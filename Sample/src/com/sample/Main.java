package com.sample;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Addition();
		System.out.println(calc.calculate(1.3, 2));
		calc = new Subtraction();
		System.out.println(calc.calculate(1, 2));
		calc = new Multiplication();
		System.out.println(calc.calculate(1, 2));
		calc = new Division();
		System.out.println(calc.calculate(1, 2));
	}
}
