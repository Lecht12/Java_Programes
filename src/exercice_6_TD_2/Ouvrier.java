package exercice_6_TD_2;

import java.time.LocalDate;
import java.time.Period;

public class Ouvrier extends Employe {

	public LocalDate  date_dentree_a_la_societe;
	public static final int SMIG = 3000;

//	constructir 
	
	public Ouvrier(String matricule , String nom, String prenom, LocalDate date_de_naissance, LocalDate date_dentree_a_la_societe) {
		super(matricule,nom, prenom,date_de_naissance);
		this.date_dentree_a_la_societe = date_dentree_a_la_societe;
	}

//	get years
	
	public int getDate_dentree_a_la_societe() {
		LocalDate Lt = LocalDate.now();
		return Period.between( date_dentree_a_la_societe , Lt).getYears();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ouvrier : ------- " + super.toString() +"\n date d'entree a la societe : "+date_dentree_a_la_societe+ "\n Salaire :"+getSalaire();
	}
	
	@Override
	public double getSalaire() {
		double salaire;
		// TODO Auto-generated method stub
		salaire = SMIG + (getDate_dentree_a_la_societe())*100;
		if(salaire <= SMIG*2 )
			return salaire = SMIG + (getDate_dentree_a_la_societe())*100;
		else 
			return salaire =  SMIG*2;
	}


}
