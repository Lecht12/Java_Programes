package exercice_6_TD_2;

import java.time.LocalDate;

public class Cadre extends Employe {

	public int index;
	
//	constructor
	
	public Cadre(int index, String matricule , String nom, String prenom, LocalDate date_de_naissance) {
		super(matricule, nom, prenom,date_de_naissance);
		this.index = index;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cadre :------------"+super.toString() + "\n index : "+index+ "--> salaire :"+getSalaire();
	}
	@Override
	public double getSalaire() {
		if(index == 1) return 12000;
		else if (index == 3) return 14000;
		else if (index == 4) return 16000;
		else if (index == 5) return 18000;
		else return 0;
	}
}
