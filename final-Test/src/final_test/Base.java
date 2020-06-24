package final_test;
/**
* Une méthode final est une méthode qui ne peut pas être redéfinie.
* La surcharge (overload en anglais), consiste à créer une méthode du même nom mais avec des paramètres différents.
* La redéfinition (overrides en anglais), consiste à créer une méthode de remplacement dans une classe fille, 
* avec la même signature (paramètre et type de retour) que la méthode de la classe parente qu'elle remplace...
*/

/**
 * Une méthode final est une méthode qui ne peut pas être surchargée. Une classe
 * final est une classe qui ne peut pas être héritée.
 *
 */
public class Base {
	int a;

	public Base(int i) {
		this.a = i;
	}

	public Base() {
		this.a = 1000;
	}

	public final void Show() {
		System.out.println(this.a);
	}

	public final void Show(String n) {
		System.out.println(n);
		System.out.println(this.a);
	}
}

class D extends Base {

	// public void Show() {
	// System.out.println(super.a);
	// }
}

class Abstract {
	public static void main(String argv[]) {
		new Base(50);
	}
}