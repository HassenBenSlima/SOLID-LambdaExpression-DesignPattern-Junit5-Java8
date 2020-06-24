package test_boite_noire;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import un_exemple_de_test.Calculator;
import un_exemple_de_test.CalculatorImpl;

class boiteNoireTest {

	@Test
	public final void testDivide() {

		Calculator calc = new CalculatorImpl();
		int a, b, res;

		a = 5;
		b = 5;
		res = a / b;
		assertTrue("a et b positif", calc.divide(a, b) == res);

		a = 0;
		b = 5;
		res = a / b;
		assertTrue("a nul", calc.divide(a, b) == res);

		a = -5;
		b = 5;
		res = a / b;
		assertTrue("a negatif", calc.divide(a, b) == res);

		a = 5;
		b = -5;
		res = a / b;
		assertTrue("b negatif", calc.divide(a, b) == res);

		a = -5;
		b = -5;
		res = a / b;
		assertTrue("a et b negatif", calc.divide(a, b) == res);
	}

	// @Test(expected = ArithmeticException.class)
	@Test
	public final void testDivideByZero() {
		Calculator calc = new CalculatorImpl();
		int a, b;

		a = 0;
		b = 0;
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calc.divide(a, b);
		});

	}

}
