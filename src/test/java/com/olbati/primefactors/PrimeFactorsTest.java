package com.olbati.primefactors;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void given1001_shouldGenerate7x11x13() {
		PrimeFactors primeFactors = new PrimeFactors();
		List<Integer> result = primeFactors.generate(1001);
		assertThat(result).containsExactly(7, 11, 13);
	}

	@Test
	public void given20_shouldGenerate2x2x5() {
		PrimeFactors primeFactors = new PrimeFactors();
		List<Integer> result = primeFactors.generate(20);
		assertThat(result).containsExactly(2, 2, 5);
	}

	@Test
	public void given7_shouldGenerate7() {
		PrimeFactors primeFactors = new PrimeFactors();
		List<Integer> result = primeFactors.generate(7);
		assertThat(result).containsExactly(7);
	}

	@Test
	public void givenPrimeNumber_shouldGenerateListWithSameNumber() {
		PrimeFactors primeFactors = new PrimeFactors();
		List<Integer> result = primeFactors.generate(3);
		assertThat(result).containsExactly(3);
	}

	@Test
	public void givenPrimeNumber_shouldRTeturnTrue() {
		PrimeFactors primeFactors = new PrimeFactors();
		boolean result = primeFactors.isPrimeNumber(5);
		assertThat(result).isTrue();
	}

	@Test
	public void givenNotPrimeNumber_shouldRTeturnFalse() {
		PrimeFactors primeFactors = new PrimeFactors();
		boolean result = primeFactors.isPrimeNumber(4);
		assertThat(result).isFalse();
	}
}
