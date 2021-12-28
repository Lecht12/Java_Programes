package exercice_7_TD_2;

import java.time.LocalDate;
import java.time.Period;

public class Primeurs extends Article implements Produits {
	
	public LocalDate date_de_peremption;

	public Primeurs() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Primeurs(LocalDate date_de_peremption,double prix_dachat, double prix_de_vente, String nom, String fournisseur) {
		super(prix_dachat,prix_de_vente,nom,fournisseur);
		this.date_de_peremption = date_de_peremption;
	}



	

	@Override
	public String toString() {
		return "Primeurs [date_de_peremption=" + date_de_peremption + "]"+super.toString();
	}




	@Override
	public LocalDate Date_de_peremption() {
		// TODO Auto-generated method stub

		return date_de_peremption ;
	}

	@Override
	public int Jours_restants() {
		// TODO Auto-generated method stub
		LocalDate ToDay = LocalDate.now();
		return Period.between(date_de_peremption, ToDay).getDays();
	}

	
	

}
