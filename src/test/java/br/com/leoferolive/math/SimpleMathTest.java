package br.com.leoferolive.math;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	SimpleMath math;

	@BeforeAll
	static void setup() {
		System.out.println("Rodando m�todo @BeforeAll");
	}

	@AfterAll
	static void cleanUp() {
		System.out.println("Rodando m�todo @AfterAll");
	}

	@BeforeEach
	void beforeEachMethod() {
		System.out.println("Rodando m�todo @beforeEachMethod");
		math = new SimpleMath();
	}

	@AfterEach
	void beforeAfterEach() {
		System.out.println("Rodando m�todo @AfterEach");
	}

	@Test
	@DisplayName("Teste de soma")
	void testSum() {
		System.out.println("Rodando m�todo testSum");

		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.sum(firstNumber, secondNumber);
		double expected = 8.2D;

		Assertions.assertEquals(expected, actual,
				() -> "O resultado da soma de " + firstNumber + " + " + secondNumber + " n�o produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}

	@Test
	@DisplayName("Teste de subtra��o")
	void testSubtraction() {
		System.out.println("Rodando m�todo testSubtraction");

		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.subtraction(firstNumber, secondNumber);
		double expected = 4.2D;

		Assertions.assertEquals(expected, actual, () -> "O resultado da subtra��o de " + firstNumber + " - "
				+ secondNumber + " n�o produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}

	@Test
	@DisplayName("Teste de multiplica��o")
	void testMultiplication() {
		System.out.println("Rodando m�todo testMultiplication");

		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.multiplication(firstNumber, secondNumber);
		double expected = 12.4D;

		Assertions.assertEquals(expected, actual, () -> "O resultado da multiplica��o de " + firstNumber + " * "
				+ secondNumber + " n�o produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}

	@Test
	@DisplayName("Teste de divis�o")
	void testDivision() {
		System.out.println("Rodando m�todo testDivision");

		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.division(firstNumber, secondNumber);
		double expected = 3.1D;

		Assertions.assertEquals(expected, actual,
				() -> "O resultado da divis�o de " + firstNumber + " / " + secondNumber + " n�o produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}

	@Test
	@DisplayName("Teste de media")
	void testMean() {
		System.out.println("Rodando m�todo testMean");

		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.mean(firstNumber, secondNumber);
		double expected = 4.1D;

		Assertions.assertEquals(expected, actual,
				() -> "O resultado da media de " + firstNumber + " + " + secondNumber + " n�o produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}

	@Test
	@DisplayName("Teste de raiz quadrada")
	void testSquareRoot() {
		System.out.println("Rodando m�todo testSquareRoot");

		double number = 16D;
		Double actual = math.squareRoot(number);
		double expected = 4D;

		Assertions.assertEquals(expected, actual,
				() -> "O resultado da raiz quadrada de " + number + " n�o produziu " + expected);
		Assertions.assertNotEquals(9.2, actual);
		Assertions.assertNotNull(actual);
	}

	@Test
	@DisplayName("Teste de divis�o por zero")
	void testDivisionByZero_ShouldThrowArithmeticException() {
		System.out.println("Rodando m�todo testDivisionByZero_ShouldThrowArithmeticException");

		double firstNumber = 6.2D;
		double secondNumber = 0D;

		var exception = "Can't divide by zero";

		ArithmeticException actual = Assertions.assertThrows(ArithmeticException.class,
				() -> math.division(firstNumber, secondNumber), () -> "Divis�o por zero deveria lancar ArithmeticException");

		Assertions.assertEquals(exception, actual.getMessage(), () -> "O erro produzido n�o foi o esperado");
	}

}
