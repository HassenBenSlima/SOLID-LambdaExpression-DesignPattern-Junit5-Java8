package java_util_function_Supplier_T_;

import java.util.function.Supplier;

import java_util_function_entities.Personne;

public class TestSupplier {

	public static void main(String[] args) {
		Supplier<String> s1 = () -> new String("hello !");
		System.out.println(s1.get());
		Supplier<Personne> s2 = () -> new Personne(50, "Dédé");
		System.out.println(s2.get());
	}
}