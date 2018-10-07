package ru.javabegin.training.spring.aop.objects;

import org.springframework.stereotype.Component;

@Component
public class SomeService {

	public int getIntValue() {
		return 5;
	}
	
	public double getDoubleValue() {
		return 5.6;
	}
	
	public void calculate(double a, double b) {
		double dValue = a/b;
		if (dValue == Double.NEGATIVE_INFINITY || dValue == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException();
        }
    }
}
