package les_bases_de_stream;

public class Personne {

	public Double taille = 0.0d;
	public Double poids = 0.0d;
	public String nom = "";
	public String prenom = "";
	public Couleur yeux = Couleur.INCONNU;

	public Personne() {
	}

	public Personne(double taille, double poids, String nom, String prenom, Couleur yeux) {
		super();
		this.taille = taille;
		this.poids = poids;
		this.nom = nom;
		this.prenom = prenom;
		this.yeux = yeux;
	}

	// public String toString() {
	// String s = "Je m'appelle " + nom + " " + prenom;
	// s += ", je pèse " + poids + " Kg";
	// s += ", et je mesure " + taille + " cm.";
	// return s;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [taille=" + taille + ", poids=" + poids + ", nom=" + nom + ", prenom=" + prenom + ", yeux="
				+ yeux + "]";
	}

	public Double getTaille() {
		return taille;
	}

	public void setTaille(Double taille) {
		this.taille = taille;
	}

	public Double getPoids() {
		return poids;
	}

	public void setPoids(Double poids) {
		this.poids = poids;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Couleur getYeux() {
		return yeux;
	}

	public void setYeux(Couleur yeux) {
		this.yeux = yeux;
	}
}

// Et une classe de test :
