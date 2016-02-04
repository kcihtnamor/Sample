package com.sample;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Addition();
		Calculator calc2 = new Subtract();
		System.out.println(calc.calculate(1, 2));
		System.out.println(calc2.calculate(1, 2));
	}
}
