package un_exemple_de_test;

public class CalculatorImpl implements Calculator {

	// Nous venons de voir comment créer des tests pour une classe basique. La
	// classe CalculatorImpl est basique parce que :
	//
	// * Elle n'a pas d'état interne;
	//
	// * Toutes ses méthodes retournent directement le résultat.

	@Override
	public int multiply(int a, int b) {
		return 0;
	}

	@Override
	public int divide(int a, int b) {
		// Nous allons jeter une exception si b vaut 0

		if (b == 0) {
			throw new ArithmeticException();
		}

		if (b == 1) {
			return b;
		}
		boolean resEstNegatif = false;
		int res = 0;
		if (a < 0) {
			resEstNegatif = !resEstNegatif;
			a = -a;
		}
		if (b < 0) {
			resEstNegatif = !resEstNegatif;
			b = -b;
		}
		while (a > 0) {
			a = substract(a, b);
			res++;
		}
		if (resEstNegatif) {
			res = -res;
		}

		return res;

	}

	@Override
	public int add(int a, int b) {

		int res = a;
		if (b > 0) {
			while (b-- != 0) {
				res++;
			}
		} else if (b < 0) {
			while (b++ != 0) {
				res--;
			}
		}

		return res;
	}

	@Override
	public int substract(int a, int b) {
		return 0;
	}

	/**
	 * soit a un entier et b aussi compris entre 0 et b un entier sur 3 bits
	 * 
	 * @param a
	 *            un entier
	 * @param b
	 *            un entier
	 * @return ab
	 */
	public int xyz(int a, int b) {
		return a * 10 + b;
	}

}
