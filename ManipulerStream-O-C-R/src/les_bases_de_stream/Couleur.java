package les_bases_de_stream;
public enum Couleur {
	
	INCONNU("non déterminé"),
	MARRON("marron"),
	BLEU("bleu"), 
	VERT("vert"), 
	VERRON("verron"), 
	ROUGE("rouge mais j'avais piscine...");

	private String name = "";

	Couleur(String n) {
		this.name = n;
	}

	public String toString() {
		return name;
	}
}
