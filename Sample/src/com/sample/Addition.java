package com.sample;

public class Addition implements Calculator {

	@Override
	public Number calculate(Number a, Number b) {
		Number result = 0;
		result = a.doubleValue() + b.doubleValue();
		return result;
	}

}
