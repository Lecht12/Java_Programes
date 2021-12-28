package exercice_7_TD_2;

import java.time.LocalDate;

public interface Produits {
	
	//	Methods
	public abstract LocalDate Date_de_peremption();
	public abstract int Jours_restants();
	
}
