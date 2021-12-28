package exercice_7_TD_2;

public class Electromenagers extends Article implements Susceptible	 {
	
	public float voltage;
	public String marque;
	
	public Electromenagers() {
		// TODO Auto-generated constructor stub
	}

	public Electromenagers(float voltage, String marque,double prix_dachat, double prix_de_vente, String nom, String fournisseur) {
		super(prix_dachat,prix_de_vente,nom,fournisseur);
		this.voltage = voltage;
		this.marque = marque;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nVoltage : "+voltage+"\n Marque : "+ marque ;
	}

	@Override
	public double lancer_le_solde(float solde) {
		
		return prix_de_vente = prix_dachat - prix_dachat*(solde/100);
	}

	@Override
	public double terminer_le_solde(float solde) {

		return prix_de_vente = prix_dachat + prix_dachat*(solde/100);
	}
}
