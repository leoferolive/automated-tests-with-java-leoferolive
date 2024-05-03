package br.com.leoferolive.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {
	
	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.sum(firstNumber, secondNumber);
		double expected = 8.2D;

		Assertions.assertEquals(expected, actual, 
				() -> "O resultado da soma de " + firstNumber + " + " + secondNumber + " não produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}
	
	@Test
	void testSubtraction() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.subtraction(firstNumber, secondNumber);
		double expected = 4.2D;
		
		Assertions.assertEquals(expected, actual, 
				() -> "O resultado da subtração de " + firstNumber + " - " + secondNumber + " não produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}
	
	@Test
	void testMultiplication() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.multiplication(firstNumber, secondNumber);
		double expected = 12.4D;
		
		Assertions.assertEquals(expected, actual, 
				() -> "O resultado da multiplicação de " + firstNumber + " * " + secondNumber + " não produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}
	
	@Test
	void testDivision() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.division(firstNumber, secondNumber);
		double expected = 3.1D;
		
		Assertions.assertEquals(expected, actual, 
				() -> "O resultado da divisão de " + firstNumber + " / " + secondNumber + " não produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}
	
	@Test
	void testMean() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.mean(firstNumber, secondNumber);
		double expected = 4.1D;
		
		Assertions.assertEquals(expected, actual, 
				() -> "O resultado da media de " + firstNumber + " + " + secondNumber + " não produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}
	
	@Test
	void testSquareRoot() {
		SimpleMath math = new SimpleMath();
		double number = 16D;
		Double actual = math.squareRoot(number);
		double expected = 4D;
		
		Assertions.assertEquals(expected, actual, 
				() -> "O resultado da raiz quadrada de " + number + " não produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}
	
}
