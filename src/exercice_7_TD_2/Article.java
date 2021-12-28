package exercice_7_TD_2;

public class Article  {
	
	public double prix_dachat; 
	public double prix_de_vente; 
	public String nom ,fournisseur;
	
	public Article() {
		// TODO Auto-generated constructor stub
	}

	public Article(double prix_dachat, double prix_de_vente, String nom, String fournisseur) {
		super();
		this.prix_dachat = prix_dachat;
		this.prix_de_vente = prix_de_vente;
		this.nom = nom;
		this.fournisseur = fournisseur;
	}
//Methods
	public double calculateur_du_taux_du_rendement () {
		return prix_de_vente - prix_dachat;
		
	}

	@Override
	public String toString() {
		return "[prix_dachat=" + prix_dachat + ", prix_de_vente=" + prix_de_vente + ", nom=" + nom
				+ ", fournisseur=" + fournisseur + "]";
	}
}
