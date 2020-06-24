package test_unitaire;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import un_exemple_de_test.Calculator;
import un_exemple_de_test.CalculatorImpl;

public class CalculatorImplTest {

	@Test
	public final void testMultiply() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDivide() {
		// le cas de test pour les cas où aucune exception ne devrait être jetée

		Calculator calc = new CalculatorImpl();
		int a, b, res;

		a = 5;
		b = 5;
		res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a et b positif");
		}

		a = 0;
		b = 5;
		res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a nul");
		}

		a = -5;
		b = 5;
		res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a negatif");
		}

		a = 5;
		b = -5;
		res = a / b;
		if (calc.divide(a, b) != res) {
			fail("b negatif");
		}

		a = -5;
		b = -5;
		res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a et b negatif");
		}

	}

	@Test
	public final void testAdd() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;

		a = 5;
		b = 5;
		res = a + b;
		assertTrue("a et b positif", calc.add(a, b) == res);

		a = 0;
		b = 5;
		res = a + b;
		assertTrue("a nul", calc.add(a, b) == res);

		a = 5;
		b = 0;
		res = a + b;
		assertTrue("b nul", calc.add(a, b) == res);

		a = 0;
		b = 0;
		res = a + b;
		assertTrue("a et b nuls", calc.add(a, b) == res);

		a = -5;
		b = 5;
		res = a + b;
		assertTrue("a negatif", calc.add(a, b) == res);

		a = 5;
		b = -5;
		res = a + b;
		assertTrue("b negatif", calc.add(a, b) == res);

		a = -5;
		b = -5;
		res = a + b;
		assertTrue("a et b negatif", calc.add(a, b) == res);
	}

	// gérer le cas où une exception devrait être lancée
	// Ce bout de code doit jeter une exception
	// Notre test doit donc échouer si aucune exception n'est levée
	@Test
	public final void testDivideByZero() {

		Calculator calc = new CalculatorImpl();
		int a, b;
		a = 5;
		b = 0;
		assertThrows(ArithmeticException.class, () -> {
			calc.divide(a, b);
		});

		// int a, b, res;
		// a = 5;
		// b = 0;
		// res = 0;
		// if (calc.divide(a, b) != res) {
		// fail("b nul");
		// }
		// a = 0;
		// b = 0;
		// res = 0;
		// if (calc.divide(a, b) != res) {
		// fail("a et b nuls");
		// }

	}

	// @Test
	// public final void testAdd() {
	//
	// Calculator calc = new CalculatorImpl();
	// int a, b, res;
	//
	// a = 5;
	// b = 5;
	// res = a + b;
	//
	// if (calc.add(a, b) != res) {
	// fail("a et b positif");
	// }
	//
	// a = 0;
	// b = 5;
	// res = a + b;
	// if (calc.add(a, b) != res) {
	// fail("a nul");
	// }
	//
	// a = 5;
	// b = 0;
	// res = a + b;
	// if (calc.add(a, b) != res) {
	// fail("b nul");
	// }
	//
	// a = 0;
	// b = 0;
	// res = a + b;
	// if (calc.add(a, b) != res) {
	// fail("a et b nuls");
	// }
	//
	// a = -5;
	// b = 5;
	// res = a + b;
	// if (calc.add(a, b) != res) {
	// fail("a negatif");
	// }
	//
	// a = 5;
	// b = -5;
	// res = a + b;
	// if (calc.add(a, b) != res) {
	// fail("b negatif");
	// }
	//
	// a = -5;
	// b = -5;
	// res = a + b;
	// if (calc.add(a, b) != res) {
	// fail("a et b negatif");
	// }
	// }

	@Test
	public final void testSubstract() {
		fail("Not yet implemented"); // TODO
	}

}