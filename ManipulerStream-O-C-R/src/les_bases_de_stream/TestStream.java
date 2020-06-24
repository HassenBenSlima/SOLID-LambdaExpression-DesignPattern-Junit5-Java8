package les_bases_de_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {
		List<Personne> listP = Arrays.asList(new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
				new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
				new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
				new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
				new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
				new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
				new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON));

		Stream<Personne> sp = listP.stream();
		sp.forEach(System.out::println);

		/*******************/

		// Stream infini

		// Stream.iterate(1, (x) -> x + 1).forEach(System.out::println);

		// Stream limité
		Stream.iterate(5, (x) -> x - 1).limit(5).forEach(System.out::println);

		// Stream.iterate(2d, (x) -> x + 1).limit(100).forEach(System.out::println);

		// Opérations intermédiaires sur les streams
		System.out.println("\nAprès le filtre");
		sp = listP.stream();
		sp.filter(x -> x.getPoids() > 50).forEach(System.out::println);

		// L'opération map

		System.out.println("\nAprès le filtre et le map");
		sp = listP.stream();
		sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).forEach(System.out::println);

		// Opérations terminales sur les streams

		// * Reduce
		System.out.println("\nAprès le filtre et le map et reduce");
		sp = listP.stream();

		Double sum = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).reduce(0.0d, (x, y) -> x + y);
		System.out.println(sum);

		System.out.println("\nAprès le filtre et le map et reduce");
		sp = listP.stream();
		/******* Autre *******/
		Optional<Double> sum1 = sp.filter(x -> x.getPoids() > 250).map(x -> x.getPoids()).reduce((x, y) -> x + y);
		// System.out.println(sum1.get());

		/******* Autre *******/
		System.out.println("\nAprès le filtre et le map et reduce");
		sp = listP.stream();

		Optional<Double> sum2 = sp.filter(x -> x.getPoids() > 250).map(x -> x.getPoids()).reduce((x, y) -> x + y);
		if (sum2.isPresent())
			System.out.println(sum2.get());
		else
			System.out.println("Aucun aggrégat de poids...");

		/******* Autre *******/

		sp = listP.stream();

		Optional<Double> sum3 = sp.filter(x -> x.getPoids() > 250).map(x -> x.getPoids()).reduce((x, y) -> x + y);
		// Permet de gérer le cas d'erreur en renvoyant 0.0 si isPresent() == false
		System.out.println(sum3.orElse(0.0));

		// * Count

		sp = listP.stream();

		long count = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).count();

		System.out.println("Nombre d'éléments : " + count);

		// * Collect

		sp = listP.stream();

		List<Double> ld = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).collect(Collectors.toList());
		System.out.println(ld);

	}
}
