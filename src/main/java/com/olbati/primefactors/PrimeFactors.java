package com.olbati.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> generate(int numberToDecompose) {
		ArrayList<Integer> result = new ArrayList<>();

		if (isPrimeNumber(numberToDecompose)) {
			result.add(numberToDecompose);
			return result;
		}

		for (int divisor = 2; divisor <= numberToDecompose; divisor++) {
			if (isPrimeFactor(numberToDecompose, divisor)) {
				result.add(divisor);
				// recusive call to generate method
				result.addAll(generate(numberToDecompose / divisor));
				break;
			}
		}

		return result;
	}

	private boolean isPrimeFactor(int numberToDecompose, int divisor) {
		return numberToDecompose % divisor == 0 && isPrimeNumber(divisor);
	}

	boolean isPrimeNumber(int number) {
		for (int divisor = 2; divisor < number; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
