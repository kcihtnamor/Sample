package com.sample;

public class Division implements Calculator {

	@Override
	public Number calculate(Number a, Number b) {
		Number result = 0;
		if(a instanceof Double) {
			result = a.doubleValue() / b.doubleValue();
		}else if(a instanceof Integer) {
			result = a.intValue() / b.intValue();
		}
		return result;
	}

}