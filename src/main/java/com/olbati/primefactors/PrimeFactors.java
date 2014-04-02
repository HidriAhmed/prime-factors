package com.olbati.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> generate(int i) {
		ArrayList<Integer> result = new ArrayList<>();

		if (isPrimeNumber(i)) {
			result.add(i);
			return result;
		}

		for (int j = 2; j <= i; j++) {
			if (i % j == 0 && isPrimeNumber(j)) {
				result.add(j);
				result.addAll(generate(i / j));
				break;
			}
		}

		return result;
	}

	boolean isPrimeNumber(int number) {
		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}
}
