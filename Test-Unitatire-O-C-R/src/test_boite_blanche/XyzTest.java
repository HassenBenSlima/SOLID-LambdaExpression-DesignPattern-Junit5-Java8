package test_boite_blanche;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import un_exemple_de_test.CalculatorImpl;

public class XyzTest {
	@Test
	public final void testXyz() {
		CalculatorImpl calc = new CalculatorImpl();
		int a, b, res;
		a = 5;
		b = 8;
		res = 58;
		assertFalse(calc.xyz(a, b) == res);
	}

}
