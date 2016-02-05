package com.sample;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Addition();
		System.out.println(calc.calculate(1, 2));
		calc = new Subtract();
		System.out.println(calc.calculate(1, 2));
	}
}
