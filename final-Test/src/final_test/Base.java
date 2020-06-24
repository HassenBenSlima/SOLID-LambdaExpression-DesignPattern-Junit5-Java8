package final_test;
/**
* Une m�thode final est une m�thode qui ne peut pas �tre red�finie.
* La surcharge (overload en anglais), consiste � cr�er une m�thode du m�me nom mais avec des param�tres diff�rents.
* La red�finition (overrides en anglais), consiste � cr�er une m�thode de remplacement dans une classe fille, 
* avec la m�me signature (param�tre et type de retour) que la m�thode de la classe parente qu'elle remplace...
*/

/**
 * Une m�thode final est une m�thode qui ne peut pas �tre surcharg�e. Une classe
 * final est une classe qui ne peut pas �tre h�rit�e.
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