package exercice_6_TD_2;

import java.time.LocalDate;
public abstract class Employe {

	public String matricule, nom, prenom;
	public LocalDate date_de_naissance;

	public Employe() {
		// TODO Auto-generated constructor stub
	}

	public Employe(String matricule ,String nom, String prenom, LocalDate date_de_naissance) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.date_de_naissance = date_de_naissance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n Matricule : "+matricule+"\n nom : "+nom+"\n Prenom : "+prenom+"\n Date de naissance :" + date_de_naissance ;
	}

	public abstract double getSalaire();
}
